// TaskService.java
// D. Singletary
// 9/12/2026
// This is the service that saves and deletes tasks.

package edu.fscj.cen3024c.taskmanager;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();
    private int currentId = 1;
    public List<Task> findAll() {
        return new ArrayList<>(taskMap.values());
    }
    public Task findById(Integer id) {
        if (!taskMap.containsKey(id)) {
            throw new TaskNotFoundException(id);
        }
        return taskMap.get(id);
    }
    public Task save(Task task) {
        if (task.getId() == null) {
            task.setId(currentId++);
        }
        taskMap.put(task.getId(), task);
        return task;
    }
    public void deleteById(Integer id) {
        if (!taskMap.containsKey(id)) {
            throw new TaskNotFoundException(id);
        }
        taskMap.remove(id);
    }
}


// TaskNotFoundException.java
// D. Singletary
// 9/12/2026
// If the task can't be found, it will throw this instead.

package edu.fscj.cen3024c.taskmanager;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Integer id) {
        super("Task not found with id " + id);
    }
}
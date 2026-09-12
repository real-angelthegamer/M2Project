// Task.java
// D. Singletary and Angel Baez
// 9/12/2026
// This sets up all the 5 tasks.

package edu.fscj.cen3024c.taskmanager;

public class Task {
    private Integer id;
    private String title;
    private String description;
    private String status; // PENDING, IN_PROGRESS, COMPLETED
    private String dueDate; // YYYY-MM-DD

    // Constructors, getters, and setters

    public Task(String dueDate, String status, String description, String title, Integer id) {
        this.dueDate = dueDate;
        this.status = status;
        this.description = description;
        this.title = title;
        this.id = id;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
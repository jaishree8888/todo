package com.example.todo.model;

public class Task {
    private int id;
    private String title;
    private String description;
    private Status status;

    public Task() {
        this.status = Status.YET_TO_START;
    }

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = Status.YET_TO_START;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

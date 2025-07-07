package com.example.todo.controller;

import com.example.todo.model.Status;
import com.example.todo.model.Task;
import com.example.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id) {
        return taskService.getTaskById(id);
    }

    @GetMapping("/status/{status}")
    public List<Task> getByStatus(@PathVariable Status status) {
        return taskService.getTasksByStatus(status);
    }

    @PutMapping("/{id}/move/{status}")
    public String moveTask(@PathVariable int id, @PathVariable Status status) {
        return taskService.moveTask(id, status);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        return taskService.deleteTask(id);
    }
}

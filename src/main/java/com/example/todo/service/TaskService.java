package com.example.todo.service;

import com.example.todo.model.Status;
import com.example.todo.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> taskList = new ArrayList<>();

    public List<Task> getAllTasks() {
        return taskList;
    }

    public Task addTask(Task task) {
        taskList.add(task);
        return task;
    }

    public Task getTaskById(int id) {
        return taskList.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public List<Task> getTasksByStatus(Status status) {
        List<Task> result = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getStatus() == status) {
                result.add(task);
            }
        }
        return result;
    }

    public String moveTask(int id, Status newStatus) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setStatus(newStatus);
            return "Task moved to " + newStatus;
        }
        return "Task not found";
    }

    public String deleteTask(int id) {
        Task task = getTaskById(id);
        if (task != null) {
            taskList.remove(task);
            return "Task deleted";
        }
        return "Task not found";
    }
}

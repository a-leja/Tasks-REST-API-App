package com.crud.tasksManager.service;

import com.crud.tasksManager.domain.Task;
import com.crud.tasksManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(final Long id) {
        return repository.findById(id).orElse(null);
    }

    public Task saveTask(final Task task) {
        return repository.save(task);
    }

    public Optional<Task> getTask(final Long id) {
        return repository.findById(id);
    }

    public void deleteTask(final Long id) {
        repository.deleteById(id);
    }
}

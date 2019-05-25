package com.crud.tasksManager.service;

import com.crud.tasksManager.domain.Task;
import com.crud.tasksManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }
}

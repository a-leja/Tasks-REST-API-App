package com.crud.tasksManager.repository;

import com.crud.tasksManager.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {

    @Override
    List<Task> findAll();
}

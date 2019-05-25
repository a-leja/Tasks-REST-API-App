package com.crud.tasksManager.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Task {
    private Long id;
    private String title;
    private String content;
}

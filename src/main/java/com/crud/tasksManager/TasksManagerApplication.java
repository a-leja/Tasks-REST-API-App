package com.crud.tasksManager;

import com.crud.tasksManager.domain.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class TasksManagerApplication extends SpringBootServletInitializer {
public class TasksManagerApplication {
	public static void main(String[] args) {

		SpringApplication.run(TasksManagerApplication.class, args);
	}


//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(TasksManagerApplication.class);
//	}
}

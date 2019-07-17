package com.crud.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.rest")
@SpringBootApplication

public class DemoSpringBApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBApplication.class, args);
	}

}

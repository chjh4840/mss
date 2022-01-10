package com.mss.category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.mss.category.controller.CategoryController;

@SpringBootApplication
public class MssApplication {

	public static void main(String[] args) {
		SpringApplication.run(MssApplication.class, args);
	}

}

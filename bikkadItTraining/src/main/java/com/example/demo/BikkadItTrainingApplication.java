package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BikkadItTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikkadItTrainingApplication.class, args);
		Book book=new Book();
		book.main(args);
	}

}

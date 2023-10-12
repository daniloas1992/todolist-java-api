package br.com.daniloalves.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	//https://start.spring.io/
	//Para executar clicar em "run" em cima do método main
	//Abrir console do banco de dados http://localhost:8080/h2-console
	
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}

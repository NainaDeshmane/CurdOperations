package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class CrudUpdateClient32Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudUpdateClient32Application.class, args);
	}

}

package com.MAINOPERATION.MainOperationApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MainOperationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainOperationAppApplication.class, args);
	System.out.println("Running main");
	}

}

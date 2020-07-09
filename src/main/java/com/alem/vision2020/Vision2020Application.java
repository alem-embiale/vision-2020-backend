package com.alem.vision2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Vision2020Application {

	public static void main(String[] args) {
		SpringApplication.run(Vision2020Application.class, args);
	}

}

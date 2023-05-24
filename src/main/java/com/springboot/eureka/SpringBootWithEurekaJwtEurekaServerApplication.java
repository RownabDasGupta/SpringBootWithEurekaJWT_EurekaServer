package com.springboot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootWithEurekaJwtEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithEurekaJwtEurekaServerApplication.class, args);
		System.out.println("My EUREKA SERVER Part for Spring Boot + Eureka and JWT Token Project");
	}

}

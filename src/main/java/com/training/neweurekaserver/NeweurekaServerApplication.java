package com.training.neweurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NeweurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeweurekaServerApplication.class, args);
	}

}

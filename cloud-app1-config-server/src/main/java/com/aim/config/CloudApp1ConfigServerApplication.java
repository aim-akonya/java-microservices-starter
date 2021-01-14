package com.aim.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudApp1ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApp1ConfigServerApplication.class, args);
	}

}

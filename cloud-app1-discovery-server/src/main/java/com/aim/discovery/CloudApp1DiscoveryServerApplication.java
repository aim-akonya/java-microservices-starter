package com.aim.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudApp1DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApp1DiscoveryServerApplication.class, args);
	}

}

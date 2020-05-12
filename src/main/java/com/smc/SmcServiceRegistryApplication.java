package com.smc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmcServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmcServiceRegistryApplication.class, args);
	}

}

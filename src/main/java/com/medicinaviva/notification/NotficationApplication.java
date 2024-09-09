package com.medicinaviva.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NotficationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotficationApplication.class, args);
	}

}

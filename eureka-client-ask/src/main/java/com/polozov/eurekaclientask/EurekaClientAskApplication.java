package com.polozov.eurekaclientask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientAskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientAskApplication.class, args);
	}
	// http://localhost:8080/
}

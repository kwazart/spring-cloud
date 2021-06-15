package com.polozov.cloudrouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CloudRouterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRouterApplication.class, args);
	}
	// http://localhost:8080/news/message1
	// http://localhost:8080/news/message2

	// http://localhost:8080/users/message1
	// http://localhost:8080/users/message2
}

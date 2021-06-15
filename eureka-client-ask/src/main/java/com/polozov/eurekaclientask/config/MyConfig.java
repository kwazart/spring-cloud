package com.polozov.eurekaclientask.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {

	@LoadBalanced // обертка на rest клиентом (по именам)
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

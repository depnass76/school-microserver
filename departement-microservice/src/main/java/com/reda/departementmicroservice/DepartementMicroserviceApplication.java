package com.reda.departementmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@SpringBootApplication
public class DepartementMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartementMicroserviceApplication.class, args);
	}
	
	
	@Bean
	@LoadBalanced
	public  RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	
}

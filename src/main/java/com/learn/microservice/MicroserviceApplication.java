package com.learn.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 This is a sample application for Actuator @see https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html
 check the http it exposes, for example:
 http://localhost:8081/application/metrics
 http://localhost:8081/application/beans
 http://localhost:8081/application/health
 http://localhost:8081/application/mappings
 */
@SpringBootApplication
public class MicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}
}

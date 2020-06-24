package com.example.jn.demoGatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoGatwayApplication {

//	@Bean
//	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(r -> r.path("/emails/**")
//						.uri("http://localhost:8081/")
//						.id("email-service"))
//
//				.route(r -> r.path("/users/**")
//						.uri("http://localhost:8080/")
//						.id("user-service"))
//				.build();
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoGatwayApplication.class, args);
	}

}


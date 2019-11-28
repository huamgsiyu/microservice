package com.syh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
// Eureka client
@EnableEurekaClient
// Feign Client
@EnableFeignClients(basePackages = "com.syh.springcloud")
// HystrixDashBoard
@EnableHystrixDashboard
public class Microservice_Consumer_Dept_8901 {
	public static void main (String[] args) {
		SpringApplication.run(Microservice_Consumer_Dept_8901.class, args);
	}
}

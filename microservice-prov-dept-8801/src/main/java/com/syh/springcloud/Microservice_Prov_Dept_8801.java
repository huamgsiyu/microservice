package com.syh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
// 开启服务熔断
@EnableCircuitBreaker
public class Microservice_Prov_Dept_8801 {
	public static void main (String[] args) {
		SpringApplication.run(Microservice_Prov_Dept_8801.class, args);
	}
}

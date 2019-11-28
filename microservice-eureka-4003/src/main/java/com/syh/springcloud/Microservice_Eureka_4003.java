package com.syh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Microservice_Eureka_4003 {
    public static void main(String[] args) {
        SpringApplication.run(Microservice_Eureka_4003.class, args);
    }
}

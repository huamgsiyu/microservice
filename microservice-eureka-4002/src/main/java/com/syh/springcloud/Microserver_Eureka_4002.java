package com.syh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Microserver_Eureka_4002 {
    public static void main(String[] args) {
        SpringApplication.run(Microserver_Eureka_4002.class, args);
    }
}

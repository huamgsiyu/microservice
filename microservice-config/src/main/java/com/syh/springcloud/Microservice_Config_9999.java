package com.syh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Microservice_Config_9999 {
    public static void main(String[] args) {
        SpringApplication.run(Microservice_Config_9999.class, args);
    }
}

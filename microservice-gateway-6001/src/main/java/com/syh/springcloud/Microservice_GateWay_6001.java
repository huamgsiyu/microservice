package com.syh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Microservice_GateWay_6001 {
    public static void main(String[] args) {
        SpringApplication.run(Microservice_GateWay_6001.class, args);
    }
}

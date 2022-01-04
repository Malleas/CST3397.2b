package com.gcu.topic71b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Topic71bApplication {

    public static void main(String[] args) {
        SpringApplication.run(Topic71bApplication.class, args);
    }

}

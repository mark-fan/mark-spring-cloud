package com.mark.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakaApplication.class, args);
    }

}

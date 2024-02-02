package com.example.photodiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // This annotation make your spring boot application act as a Eureka server
public class PhotoDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoDiscoveryServiceApplication.class, args);
    }

}

package com.tang.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOrderApplication.class, args);
    }

}

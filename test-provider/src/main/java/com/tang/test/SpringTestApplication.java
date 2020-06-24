package com.tang.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringTestApplication.class, args);

    }

}

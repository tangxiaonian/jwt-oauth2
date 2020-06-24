package com.tang.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringAppGateWay {

    public static void main(String[] args) {

        SpringApplication.run(SpringAppGateWay.class, args);

    }

}

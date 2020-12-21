package com.crips.sonsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudServerSonsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerSonsumerApplication.class, args);
    }

}

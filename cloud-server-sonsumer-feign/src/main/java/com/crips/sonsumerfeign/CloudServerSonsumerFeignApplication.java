package com.crips.sonsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //表明这是一个eureka客户端
@EnableFeignClients(basePackages = "com.crips.*") //开启feign
public class CloudServerSonsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerSonsumerFeignApplication.class, args);
    }

}

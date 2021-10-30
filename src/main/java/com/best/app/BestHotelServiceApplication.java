package com.best.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.best"})
@EnableEurekaClient
public class BestHotelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BestHotelServiceApplication.class, args);
    }

}

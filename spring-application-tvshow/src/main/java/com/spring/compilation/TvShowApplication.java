package com.spring.compilation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TvShowApplication {
    public static void main(String[] args) {
        SpringApplication.run(TvShowApplication.class, args);
    }
}

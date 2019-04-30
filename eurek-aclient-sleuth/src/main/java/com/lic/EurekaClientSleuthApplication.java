package com.lic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
    @EnableEurekaClient
    @EnableZipkinServer  // 启用zipkin-server
    public class EurekaClientSleuthApplication {

        public static void main(String[] args) {
            SpringApplication.run(EurekaClientSleuthApplication.class, args);
        }
    }


package com.QingCheng.erukea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErukeaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErukeaApplication.class, args);
    }

}

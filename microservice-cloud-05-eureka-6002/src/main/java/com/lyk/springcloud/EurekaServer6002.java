package com.lyk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liyk
 * @Data 2019/3/9 19:27
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer6002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer6002.class,args);
    }
}

package com.lyk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liyk
 * @Data 2019/3/9 16:52
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductConsumer80 {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer80.class,args);
    }


}

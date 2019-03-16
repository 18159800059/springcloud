package com.lyk.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liyk
 * @Data 2019/3/9 16:34
 */
@MapperScan("com.lyk.springcloud.mapper")
@SpringBootApplication
@EnableEurekaClient
public class ProductProviderApplication8002 {


    public static void main(String[] args) {

        SpringApplication.run(ProductProviderApplication8002.class,args);
    }
}

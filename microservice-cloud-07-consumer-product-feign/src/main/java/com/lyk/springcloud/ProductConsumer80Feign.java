package com.lyk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liyk
 * @Data 2019/3/9 16:52
 */
@SpringBootApplication
//会扫描指定包下使用了@feignClient注解的接口
@EnableFeignClients(value = "com.lyk.springcloud.service")
@EnableEurekaClient
public class ProductConsumer80Feign {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer80Feign.class,args);
    }


}

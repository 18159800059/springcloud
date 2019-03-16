package com.lyk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author liyk
 * @Data 2019/3/10 14:15
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001 {

    public static void main(String[] args) {

        SpringApplication.run(HystrixDashboard9001.class,args);
    }
}

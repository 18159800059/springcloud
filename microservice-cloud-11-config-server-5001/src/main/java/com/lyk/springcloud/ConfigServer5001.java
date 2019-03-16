package com.lyk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liyk
 * @Data 2019/3/16 10:36
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer5001.class,args);
    }
}

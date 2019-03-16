package com.lyk.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liyk
 * @Data 2019/3/9 16:47
 */
@Configuration
public class ConfigBean {

    // 向容器中添加 RestTemplate 组件,直接通过此组件可调用 REST 接口
    @Bean
    //实现客户端负载均衡，调用目标地址ip可以变成服务名，服务名就是目标服务配置文件的spring.application.name=?
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

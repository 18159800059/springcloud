package com.lyk.springcloud.controller;

import com.lyk.springcloud.entities.Product;
import com.lyk.springcloud.service.ProductFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author liyk
 * @Data 2019/3/9 16:50
 */
@RestController
public class ProductConsumerFeignControlle {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    //eureka整合ribbon后不用关心提供者的ip和port，可以直接用spring.application.name的服务名进行访问
    //private static final String REST_URL_PREFIX = "http://microservice-product";

    @Autowired
    private ProductFeignService productFeignService;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return productFeignService.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productFeignService.get(id);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return productFeignService.list();
    }


}

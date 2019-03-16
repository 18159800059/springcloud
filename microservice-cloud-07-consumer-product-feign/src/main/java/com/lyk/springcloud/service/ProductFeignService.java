package com.lyk.springcloud.service;

import com.lyk.springcloud.entities.Product;
import com.lyk.springcloud.service.impl.ProductFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author liyk
 * @Data 2019/3/10 11:55
 */
@FeignClient(value = "microservice-product" ,fallback = ProductFeignServiceFallback.class)
public interface ProductFeignService {

    @RequestMapping(value = "/product/add")
    boolean add(Product product);

    @RequestMapping(value = "/product/get/{id}")
    Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/product/list")
    List<Product> list();
}

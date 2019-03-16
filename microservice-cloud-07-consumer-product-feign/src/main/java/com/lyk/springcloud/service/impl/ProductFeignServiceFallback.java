package com.lyk.springcloud.service.impl;

import com.lyk.springcloud.entities.Product;
import com.lyk.springcloud.service.ProductFeignService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liyk
 * @Data 2019/3/10 13:51
 */
@Component
public class ProductFeignServiceFallback implements ProductFeignService {

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id,"id = "+id+"不存在","数据不存在hystrix-feign");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}

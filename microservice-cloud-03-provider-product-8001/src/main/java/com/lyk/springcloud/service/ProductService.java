package com.lyk.springcloud.service;

import com.lyk.springcloud.entities.Product;

import java.util.List;

/**
 * @author liyk
 * @Data 2019/3/9 16:27
 */
public interface ProductService {

    boolean add(Product product);
    Product get(Long id);
    List<Product> list();
}

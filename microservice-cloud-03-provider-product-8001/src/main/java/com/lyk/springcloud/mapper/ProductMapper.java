package com.lyk.springcloud.mapper;

import com.lyk.springcloud.entities.Product;

import java.util.List;

/**
 * @author liyk
 * @Data 2019/3/9 16:03
 */
//@Mapper //或者在启动类上加上@MapperScan标识
public interface ProductMapper {

    //这个product公共类是从cloud-02-api maven引入过来的
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);

}

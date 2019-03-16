package com.lyk.springcloud.controller;

import com.lyk.springcloud.entities.Product;
import com.lyk.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liyk
 * @Data 2019/3/9 16:33
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }


    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);
        if (product == null){
            throw  new RuntimeException();
        }
        return product;
    }


    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}

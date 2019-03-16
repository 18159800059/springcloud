package com.lyk.springcloud.controller;

import com.lyk.springcloud.entities.Product;
import com.lyk.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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


    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);
        //模拟异常
        /*if(product == null) {
            int a = 1/0;
            //throw new RuntimeException("ID=" + id + "无效");
        }*/
        return product;
    }

    //当get方法出现异常时，则会调用此方法. 注意此方法的返回值，参数列表与原方法一致
    public Product getFallback(@PathVariable("id") Long id) {
        return new Product(id,
                "ID=" + id + "无效--@HystrixCommand",
                "无有效数据库");
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}

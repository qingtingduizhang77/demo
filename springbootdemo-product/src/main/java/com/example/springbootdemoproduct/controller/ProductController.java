package com.example.springbootdemoproduct.controller;

import com.example.springbootdemoentity.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping(value = "getProduct")
    public String getProduct(){
        Product product = new Product();
        return product.toString();
    }
}

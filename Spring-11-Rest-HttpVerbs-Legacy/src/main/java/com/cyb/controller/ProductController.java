package com.cyb.controller;

import com.cyb.entity.Product;
import com.cyb.repository.ProductRepository;
import com.cyb.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;
    private ProductRepository productRepository;

    public ProductController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public @ResponseBody Product getProduct(@PathVariable("id") long id){

        return productService.getProduct(id);
    }

    @RequestMapping(value = "/products")
    public @ResponseBody List<Product> getProducts(){

        return productService.getProducts();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody Product create(Product product){


        return productRepository.save(product);


    }

    //create, delete, update products
}

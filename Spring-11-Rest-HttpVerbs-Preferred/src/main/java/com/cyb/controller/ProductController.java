package com.cyb.controller;

import com.cyb.entity.Product;
import com.cyb.repository.ProductRepository;
import com.cyb.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private ProductRepository productRepository;

    public ProductController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @GetMapping(value = "/{id}")
    public Product getProduct(@PathVariable("id") long id){

        return productService.getProduct(id);
    }

    @GetMapping
    public List<Product> getProducts(){

        return productService.getProducts();
    }

    @PostMapping
    public  List<Product> createProduct(@RequestBody Product product){


        return productService.createProduct(product);


    }

    @DeleteMapping(value = "/{id")
    public  List<Product> deleteProduct(@PathVariable("id" ) long id){

        return productService.delete(id);

    }

    @PutMapping(value = "/{id}")
    public  List<Product> updateProduct(@PathVariable("id") long id,  @RequestBody  Product product){

        return productService.updateProduct(id, product);

    }


}

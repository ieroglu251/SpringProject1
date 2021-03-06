package com.cyb.controller;

import com.cyb.entity.Product;
import com.cyb.entity.ResponseWrapper;
import com.cyb.repository.ProductRepository;
import com.cyb.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
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
    public ResponseEntity<Product> getProduct(@PathVariable("id") long id){

        return ResponseEntity.ok(productService.getProduct(id));



    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){

        HttpHeaders responseHttpHeaders = new HttpHeaders();
        responseHttpHeaders.set("Version","syb.v1");
        responseHttpHeaders.set("Operation","Get List");

        return ResponseEntity.ok().headers(responseHttpHeaders).body(productService.getProducts());

    }

    @PostMapping
    public  ResponseEntity<List<Product>> createProduct(@RequestBody Product product){

        List<Product> set = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).header("version","cyb")
                .header("oppp","Create")
                .body(set);
    }

    @DeleteMapping(value = "/{id")
    public  ResponseEntity<List<Product>> deleteProduct(@PathVariable("id" ) long id){

        HttpHeaders responseHttpHeaders = new HttpHeaders();
        responseHttpHeaders.set("Version","syb.v1");
        responseHttpHeaders.set("Operation","delete");

        List<Product> list = productService.delete(id);

        return new ResponseEntity<>(list,responseHttpHeaders,HttpStatus.OK);



    }

    @PutMapping(value = "/{id}")
    public  ResponseEntity<List<Product>> updateProduct(@PathVariable("id") long id,  @RequestBody  Product product){

        MultiValueMap<String,String> map = new LinkedMultiValueMap<>();
        map.add("Version","cyb.v1");
        map.add("Operation","update");

        List<Product> list = productService.updateProduct(id, product);

        return new ResponseEntity<>(list,map,HttpStatus.OK);



    }

    @GetMapping("/read")
    public ResponseEntity<ResponseWrapper> readAllProducts(){
        return ResponseEntity
                .ok(new ResponseWrapper("products successfully retrieved",productService.getProducts()));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseWrapper> deleteProduct2(@PathVariable("id") long id){
        return ResponseEntity.ok(new ResponseWrapper("product successfully deleted"));

    }

    @DeleteMapping("/delete2/{id}")
    public ResponseEntity<ResponseWrapper> deleteProduct1(@PathVariable("id") long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ResponseWrapper("deletedd successfully"));

    }


}

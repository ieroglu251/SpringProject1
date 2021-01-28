package com.cyb.bootstrap;

import com.cyb.entity.Product;
import com.cyb.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerater implements CommandLineRunner {

    private ProductRepository productRepository;



    public DataGenerater(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Product pc = new Product("Dell");
        Product Laptop = new Product("MacBook");
        Product phone = new Product("iphone");
        Product tablet = new Product("ipad");

        productRepository.save(pc);
        productRepository.save(Laptop);
        productRepository.save(phone);
        productRepository.save(tablet);



    }
}

package com.example.apinventory;

import entities.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.ProductRepository;
@Configuration
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "entities")
@SpringBootApplication
public class ApInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApInventoryApplication.class, args);
    }
    @Autowired
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new product(null,"Computer Desk Top HP",900));
            productRepository.save(new product(null,"Printer Epson",80));
            productRepository.save(new product(null,"MacBook Pro Lap Top",1800));
            productRepository.findAll().forEach(System.out::println);
        };
    }

}

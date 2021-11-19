package com.example.billingservice.feign;

import com.example.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="INVENTORY-SERVICE")
public interface ProductItemRestClient {

    @GetMapping(path = "/products")
    PagedModel<Product> pageProducts();

    @GetMapping(path="/products/{id}")
    public Product getProductById(@PathVariable Long id);
}
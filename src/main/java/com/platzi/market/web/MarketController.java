package com.platzi.market.web;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.service.ProductService;
import com.platzi.market.persistence.entity.ProductEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/market")
class MarketController {

    private ProductService service;

    @GetMapping("/products")
    public List<Product> getAll() {
        return service.getAll();
    }

    @GetMapping("/products/{productId}")
    public Product getById(@PathVariable Long productId) {
        return service.getById(productId).orElseThrow();
    }
}
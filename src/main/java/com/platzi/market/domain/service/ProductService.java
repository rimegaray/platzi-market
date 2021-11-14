package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.IProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    private IProductRepository repository;

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Optional<Product> getById(Long productId) {
        return repository.getById(productId);
    }

}

package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {

    List<Product> getAll();
    Optional<Product> getById(Long productId);
    Product create(Product product);
}

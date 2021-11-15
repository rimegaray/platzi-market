package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.repository.IProductRepository;
import com.platzi.market.domain.repository.IPurchaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PurchaseService {

    private IPurchaseRepository repository;

    public List<Purchase> getAll() {
        return repository.getAll();
    }

    public Optional<Purchase> getByCustomerId(String customerId) {
        return repository.getByCustomerId(customerId);
    }

    public Purchase create(Purchase purchase){
        return repository.create(purchase);
    }

}

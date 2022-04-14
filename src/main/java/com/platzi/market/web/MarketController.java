package com.platzi.market.web;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.service.ProductService;
import com.platzi.market.domain.service.PurchaseService;
import com.platzi.market.web.mapper.ProductRequestMapper;
import com.platzi.market.web.mapper.ProductResponseMapper;
import com.platzi.market.web.mapper.PurchaseRequestMapper;
import com.platzi.market.web.mapper.PurchaseResponseMapper;
import com.platzi.market.web.model.ProductRequest;
import com.platzi.market.web.model.ProductResponse;
import com.platzi.market.web.model.PurchaseRequest;
import com.platzi.market.web.model.PurchaseResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
class MarketController {

    private ProductService productService;
    private PurchaseService purchaseService;
    private ProductRequestMapper productRequestMapper;
    private ProductResponseMapper productResponseMapper;
    private PurchaseResponseMapper purchaseResponseMapper;
    private PurchaseRequestMapper purchaseRequestMapper;

    @GetMapping("/product")
    public List<ProductResponse> getAllProducts() {
        return productService.getAll().stream()
                .map(product -> productResponseMapper.toProductResponse(product))
                .collect(Collectors.toList());
    }

    @GetMapping("/product/{productId}")
    public ProductResponse getProductById(@PathVariable Long productId) {
        return productService.getById(productId)
                .map(product -> productResponseMapper.toProductResponse(product))
                .orElseThrow();
    }

    @PostMapping("/product")
    public ProductResponse createProduct(@RequestBody ProductRequest request) {
        return productResponseMapper.toProductResponse(
                productService.create(productRequestMapper.toProduct(request)));
    }

    @GetMapping("/purchase")
    public List<PurchaseResponse> getAllPurchases() {
        return purchaseService.getAll().stream()
                .map(product -> purchaseResponseMapper.toPurchaseResponse(product))
                .collect(Collectors.toList());
    }

    @PostMapping("/purchase")
    public PurchaseResponse createPurchase(@RequestBody PurchaseRequest request) {
        Purchase purchase = purchaseService.create(purchaseRequestMapper.toPurchase(request));
        return purchaseResponseMapper.toPurchaseResponse(purchase);
    }
}
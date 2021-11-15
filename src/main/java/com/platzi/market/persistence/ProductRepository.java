package com.platzi.market.persistence;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.IProductRepository;
import com.platzi.market.persistence.crud.IProductDao;
import com.platzi.market.persistence.entity.ProductEntity;
import com.platzi.market.persistence.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class ProductRepository implements IProductRepository {
    private IProductDao productDao;
    private ProductMapper productMapper;

    @Override
    public List<Product> getAll() {
        return productMapper.toProducts((List<ProductEntity>) productDao.findAll());
    }

    @Override
    public Optional<Product> getById(Long productId) {
        return productDao.findById(productId)
                .map(productMapper::toProduct);
    }

    @Override
    public Product create(Product product) {
        ProductEntity entity = productDao.save(productMapper.toProductEntity(product));
        return productMapper.toProduct(entity);
    }
}

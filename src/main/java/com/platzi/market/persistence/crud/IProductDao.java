package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IProductDao extends CrudRepository<ProductEntity, Long> {

    Optional<ProductEntity> findByProductId(Long productId);
}

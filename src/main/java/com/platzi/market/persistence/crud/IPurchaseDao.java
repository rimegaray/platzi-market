package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.ProductEntity;
import com.platzi.market.persistence.entity.PurchaseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IPurchaseDao extends CrudRepository<PurchaseEntity, Long> {

    Optional<PurchaseEntity> findByCustomerId(String customerId);
}

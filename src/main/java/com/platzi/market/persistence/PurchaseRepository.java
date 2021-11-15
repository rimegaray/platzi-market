package com.platzi.market.persistence;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.repository.IProductRepository;
import com.platzi.market.domain.repository.IPurchaseRepository;
import com.platzi.market.persistence.crud.IProductDao;
import com.platzi.market.persistence.crud.IPurchaseDao;
import com.platzi.market.persistence.entity.ProductEntity;
import com.platzi.market.persistence.entity.PurchaseEntity;
import com.platzi.market.persistence.mapper.ProductMapper;
import com.platzi.market.persistence.mapper.PurchaseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class PurchaseRepository implements IPurchaseRepository {
    private IPurchaseDao purchaseDao;
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> getAll() {
        return purchaseMapper.toPurchases((List<PurchaseEntity>) purchaseDao.findAll());
    }

    @Override
    public Optional<Purchase> getByCustomerId(String customerId) {
        return purchaseDao.findByCustomerId(customerId)
                .map(purchaseMapper::toPurchase);
    }

    @Override
    public Purchase create(Purchase purchase) {
        PurchaseEntity entity = purchaseDao.save(purchaseMapper.toPurchaseEntity(purchase));
        return purchaseMapper.toPurchase(entity);
    }
}

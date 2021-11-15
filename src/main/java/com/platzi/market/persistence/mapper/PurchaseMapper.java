package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.Purchase;
import com.platzi.market.persistence.entity.ProductEntity;
import com.platzi.market.persistence.entity.PurchaseEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {PurchaseProductMapper.class},
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PurchaseMapper {

    Purchase toPurchase(PurchaseEntity entity);
    List<Purchase> toPurchases(List<PurchaseEntity> entities);

    @InheritInverseConfiguration
    PurchaseEntity toPurchaseEntity(Purchase dto);
}

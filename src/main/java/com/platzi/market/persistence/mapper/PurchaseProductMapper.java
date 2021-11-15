package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.PurchaseProduct;
import com.platzi.market.persistence.entity.PurchaseProductEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {ProductMapper.class},
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PurchaseProductMapper {

    PurchaseProduct toPurchase(PurchaseProductEntity entity);
    List<PurchaseProduct> toPurchaseProducts(List<PurchaseProductEntity> entities);

    @InheritInverseConfiguration
    PurchaseProductEntity toPurchaseProductEntity(PurchaseProduct dto);
}

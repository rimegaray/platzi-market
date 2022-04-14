package com.platzi.market.web.mapper;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.PurchaseProduct;
import com.platzi.market.web.model.PurchaseProductRequest;
import com.platzi.market.web.model.PurchaseRequest;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseProductRequestMapper {

    @Mapping(target = "productEntity", ignore = true)
    PurchaseProduct toPurchaseProduct(PurchaseProductRequest request);
    List<PurchaseProduct> toPurchaseProducts(List<PurchaseProductRequest> response);

    @InheritInverseConfiguration
    @Mapping(target = "productId", ignore = true)
    PurchaseProductRequest toPurchaseProductRequest(PurchaseProduct dto);
}

package com.platzi.market.web.mapper;

import com.platzi.market.domain.Purchase;
import com.platzi.market.persistence.mapper.PurchaseProductMapper;
import com.platzi.market.web.model.PurchaseRequest;
import com.platzi.market.web.model.PurchaseResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseProductRequestMapper.class})
public interface PurchaseRequestMapper {

    @Mapping(target = "purchaseProducts", source = "purchaseProducts")
    Purchase toPurchase(PurchaseRequest request);
    List<Purchase> toPurchases(List<PurchaseRequest> response);

    @InheritInverseConfiguration
    PurchaseRequest toPurchaseRequest(Purchase dto);
}

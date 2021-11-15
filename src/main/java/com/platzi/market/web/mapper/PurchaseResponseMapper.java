package com.platzi.market.web.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.Purchase;
import com.platzi.market.persistence.mapper.CategoryMapper;
import com.platzi.market.persistence.mapper.PurchaseProductMapper;
import com.platzi.market.web.model.ProductResponse;
import com.platzi.market.web.model.PurchaseResponse;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseProductMapper.class})
public interface PurchaseResponseMapper {

    Purchase toPurchase(PurchaseResponse request);
    List<Purchase> toPurchases(List<PurchaseResponse> response);

    @InheritInverseConfiguration
    PurchaseResponse toPurchaseResponse(Purchase dto);
}

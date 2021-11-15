package com.platzi.market.web.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.ProductEntity;
import com.platzi.market.persistence.mapper.CategoryMapper;
import com.platzi.market.web.model.ProductRequest;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductRequestMapper {

    @Mapping(target = "status", constant = "true")
    Product toProduct(ProductRequest request);
    List<Product> toProducts(List<ProductRequest> requests);

    @InheritInverseConfiguration
    ProductRequest toProductRequest(Product dto);
}

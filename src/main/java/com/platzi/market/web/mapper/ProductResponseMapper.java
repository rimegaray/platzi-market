package com.platzi.market.web.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.mapper.CategoryMapper;
import com.platzi.market.web.model.ProductRequest;
import com.platzi.market.web.model.ProductResponse;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductResponseMapper {

    Product toProduct(ProductResponse request);
    List<Product> toProducts(List<ProductResponse> response);

    @InheritInverseConfiguration
    ProductResponse toProductResponse(Product dto);
}

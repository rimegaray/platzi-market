package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.CategoryEntity;
import com.platzi.market.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "productId", target = "productId" ),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "categoryId", target = "categoryId" ),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "stockQuantity", target = "stockQuantity" ),
            @Mapping(source = "state", target = "state"),
            @Mapping(source = "categoryEntity", target = "category")
    })
    Product toProduct(ProductEntity entity);
    List<Product> toProducts(List<ProductEntity> entities);

    @InheritInverseConfiguration
    @Mapping(target = "code", ignore = true)
    ProductEntity toCategoryEntity(Product dto);
}

package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.CategoryEntity;
import com.platzi.market.persistence.entity.ProductEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {CategoryMapper.class},
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ProductMapper {

    @Mapping(source = "categoryEntity", target = "category")
    Product toProduct(ProductEntity entity);
    List<Product> toProducts(List<ProductEntity> entities);

    @InheritInverseConfiguration
    ProductEntity toProductEntity(Product dto);
}

package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.CategoryEntity;
import com.platzi.market.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "categoryId", target = "categoryId" ),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "state", target = "state")
    })
    Category toCategory(CategoryEntity entity);

    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    CategoryEntity toCategoryEntity(Category dto);
}

package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.CategoryEntity;
import com.platzi.market.persistence.entity.ProductEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CategoryMapper {

    Category toCategory(CategoryEntity entity);

    @InheritInverseConfiguration
    CategoryEntity toCategoryEntity(Category dto);
}

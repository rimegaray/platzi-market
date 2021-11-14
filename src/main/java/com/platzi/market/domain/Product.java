package com.platzi.market.domain;

import com.platzi.market.persistence.entity.CategoryEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
public class Product {

    private Long productId;

    private String name;

    private Long categoryId;

    private BigDecimal price;

    private Integer stockQuantity;

    private Boolean state;

    private Category category;

}

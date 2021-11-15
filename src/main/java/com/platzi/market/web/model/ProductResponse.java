package com.platzi.market.web.model;

import com.platzi.market.domain.Category;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductResponse {

    private Long productId;

    private String name;

    private Long categoryId;

    private BigDecimal price;

    private Integer stockQuantity;

    private Boolean status;

    private Category category;

}

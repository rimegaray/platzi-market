package com.platzi.market.web.model;

import com.platzi.market.domain.Product;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PurchaseProductRequest {

    private Integer quantity;

    private BigDecimal total;

    private Boolean status;

    private Long productId;

}

package com.platzi.market.domain;

import com.platzi.market.persistence.entity.ProductEntity;
import com.platzi.market.persistence.entity.PruchaseProductPK;
import com.platzi.market.persistence.entity.PurchaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class PurchaseProduct {

    private Integer quantity;

    private BigDecimal total;

    private Boolean status;

    private Product productEntity;

}

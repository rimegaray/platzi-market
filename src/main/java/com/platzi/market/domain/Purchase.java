package com.platzi.market.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Purchase {

    private Long purchaseId;

    private Long customerId;

    private LocalDateTime date;

    private String paymentMethod;

    private String comment;

    private Boolean status;

    private List<PurchaseProduct> purchaseProducts;

}

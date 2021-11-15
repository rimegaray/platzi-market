package com.platzi.market.web.model;

import com.platzi.market.domain.PurchaseProduct;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class PurchaseResponse {

    private Long purchaseId;

    private Long customerId;

    private LocalDateTime date;

    private String paymentMethod;

    private String comment;

    private String status;

    private List<PurchaseProduct> purchaseProducts;

}

package com.platzi.market.web.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class PurchaseRequest {

    private Long purchaseId;

    private Long customerId;

    private LocalDateTime date;

    private String paymentMethod;

    private String comment;

    private String status;

    private List<PurchaseProductRequest> purchaseProducts;

}

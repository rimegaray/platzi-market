package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class PruchaseProductPK implements Serializable {

    @Column(name = "id_compra")
    private Long purchaseId;

    @Column(name = "id_producto")
    private Long productId;

}

package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "compras_productos")
@Getter
@Setter
public class PurchaseProductEntity {

    @EmbeddedId
    private PruchaseProductPK id;

    @Column(name = "cantidad")
    private Integer quantity;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "estado")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private PurchaseEntity purchase;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private ProductEntity productEntity;

}

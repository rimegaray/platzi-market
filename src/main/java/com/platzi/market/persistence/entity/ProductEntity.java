package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long productId;

    @Column(name = "nombre")
    private String name;

    @Column(name = "id_categoria")
    private Long categoryId;

    @Column(name = "codigo_barras")
    private String code;

    @Column(name = "precio_venta")
    private BigDecimal price;

    @Column(name = "cantidad_stock")
    private Integer stockQuantity;

    @Column(name = "estado")
    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private CategoryEntity categoryEntity;

}

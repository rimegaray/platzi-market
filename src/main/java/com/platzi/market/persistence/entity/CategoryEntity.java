package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
@Getter
@Setter
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long categoryId;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "estado")
    private Boolean status;

    @OneToMany(mappedBy = "categoryEntity")
    private List<ProductEntity> products;

}

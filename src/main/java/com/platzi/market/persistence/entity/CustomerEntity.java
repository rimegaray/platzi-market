package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class CustomerEntity {

    @Id
    @Column(name = "id_cliente")
    private String customerId;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellidos")
    private String lastName;

    @Column(name = "celular")
    private Long phone;

    @Column(name = "direccion")
    private String address;

    @Column(name = "correo_electronico")
    private String email;

    @OneToMany(mappedBy = "customerEntity")
    private List<PurchaseEntity> purchases;

}

package com.electro.cigma.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Embedded
    @Column(nullable = false)
    private AddressDetails addressDetails;

    @Column(nullable = false,name = "Default_Address")
    private boolean defaultAddress;
}

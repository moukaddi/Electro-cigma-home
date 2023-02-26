package com.electro.cigma.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter
@Setter
public class BillingAddress {
    private String address;

}

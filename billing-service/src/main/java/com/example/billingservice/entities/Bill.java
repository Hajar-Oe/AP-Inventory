package com.example.billingservice.entities;

import com.example.billingservice.model.customer;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity @Data
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> ProductItems;
    private Long customerID;
    @Transient
    private customer customer;

}

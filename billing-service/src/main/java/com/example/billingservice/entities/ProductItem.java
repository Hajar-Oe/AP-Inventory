package com.example.billingservice.entities;

import com.example.billingservice.model.product;

import javax.persistence.*;

@Entity
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double quantity;
    private double price;
    private long productId;
    @ManyToOne
    private Bill bill;
    @Transient
    private product product;
}

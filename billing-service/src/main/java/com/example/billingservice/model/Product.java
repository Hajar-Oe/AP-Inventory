package com.example.billingservice.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class Product {
    private Long id;
    private String name;
    private double price;
}

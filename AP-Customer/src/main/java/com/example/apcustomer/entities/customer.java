package com.example.apcustomer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String email;
}

@Projection(name = "fullCustomer",types = customer.class)
interface CustomerProjection extends Projection{
    public Long getId();
    public String getName();
    public String getEmail();
}

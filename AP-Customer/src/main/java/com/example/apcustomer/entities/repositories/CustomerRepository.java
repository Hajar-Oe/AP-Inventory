package com.example.apcustomer.entities.repositories;

import com.example.apcustomer.entities.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<customer,Long> {
}

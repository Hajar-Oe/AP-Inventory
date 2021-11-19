package com.example.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billingservice.entities.Bill;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {

}

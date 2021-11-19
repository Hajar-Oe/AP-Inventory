package com.example.apcustomer;

import com.example.apcustomer.entities.customer;
import com.example.apcustomer.entities.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ApCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApCustomerApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(customer.class);
        return args -> {
            customerRepository.save(new customer(null,"Enset","contact@enset-media.ma"));
            customerRepository.save(new customer(null,"FSTM","contact@fstm.ma"));
            customerRepository.save(new customer(null,"ENSAM","contact@ensam.ma"));
            customerRepository.findAll().forEach(System.out::println);
        };
    }
}

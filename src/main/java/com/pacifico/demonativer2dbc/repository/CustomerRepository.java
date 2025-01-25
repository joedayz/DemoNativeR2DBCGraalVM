package com.pacifico.demonativer2dbc.repository;

import com.pacifico.demonativer2dbc.entity.Customer;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CustomerRepository extends R2dbcRepository<Customer, Long> {
  Flux<Customer> findByLastName(String lastName); // Ejemplo de método de búsqueda
}
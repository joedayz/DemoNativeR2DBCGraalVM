package com.pacifico.demonativer2dbc.controller;

import com.pacifico.demonativer2dbc.entity.Customer;
import com.pacifico.demonativer2dbc.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  private final CustomerRepository customerRepository;

  public CustomerController(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @GetMapping
  public Flux<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

  @GetMapping("/{id}")
  public Mono<Customer> getCustomerById(@PathVariable Long id) {
    return customerRepository.findById(id);
  }

  @PostMapping
  public Mono<Customer> createCustomer(@RequestBody Customer customer) {
    return customerRepository.save(customer);
  }

  @GetMapping("/by-last-name")
  public Flux<Customer> getCustomersByLastName(@RequestParam String lastName) {
    return customerRepository.findByLastName(lastName);
  }
}

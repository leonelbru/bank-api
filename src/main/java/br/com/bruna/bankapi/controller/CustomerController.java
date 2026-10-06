package br.com.bruna.bankapi.controller;

import br.com.bruna.bankapi.dto.CreateCustomerRequest;
import br.com.bruna.bankapi.model.Customer;
import br.com.bruna.bankapi.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customers")

public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public Customer create(@RequestBody CreateCustomerRequest request) {
        Customer customer = new Customer(request.name(), request.cpf(), request.email(), request.phone());
        return customerService.create(customer);
    }

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable UUID id) {
        return customerService.findById(id);
    }
}
package br.com.bruna.bankapi.customer.controller;

import br.com.bruna.bankapi.customer.dto.CreateCustomerRequest;
import br.com.bruna.bankapi.customer.model.Customer;
import br.com.bruna.bankapi.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customers")

public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public Customer create(@RequestBody CreateCustomerRequest request) {
        Customer customer = new Customer(
                request.name(),
                request.cpf(),
                request.email(),
                request.phone()
        );
        return customerService.create(customer);
    }

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
}
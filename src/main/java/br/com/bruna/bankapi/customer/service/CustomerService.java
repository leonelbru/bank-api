package br.com.bruna.bankapi.customer.service;

import br.com.bruna.bankapi.customer.model.Customer;
import br.com.bruna.bankapi.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }
}

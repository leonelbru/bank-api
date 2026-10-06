package br.com.bruna.bankapi.controller;

import br.com.bruna.bankapi.dto.CreateAccountRequest;
import br.com.bruna.bankapi.model.Account;
import br.com.bruna.bankapi.model.Customer;
import br.com.bruna.bankapi.service.AccountService;
import br.com.bruna.bankapi.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/accounts")

public class AccountController {
    private final AccountService accountService;
    private final CustomerService customerService;

    @PostMapping
    public Account create(@RequestBody CreateAccountRequest request) {
        Customer customer = customerService.findById(request.customerId());

        Account account = new Account(
                request.accountNumber(),
                request.agency(),
                customer
        );
        return accountService.create(account);
    }

    @GetMapping
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public Account findById(@PathVariable UUID id) {
        return accountService.findById(id);
    }

}



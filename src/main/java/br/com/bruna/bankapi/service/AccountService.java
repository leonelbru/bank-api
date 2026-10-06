package br.com.bruna.bankapi.service;

import br.com.bruna.bankapi.model.Account;
import br.com.bruna.bankapi.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account create(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findById(UUID id) {
        return accountRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Account not found"));
    }

    public Account deposit(UUID id, BigDecimal amount) {
        Account account = findById(id);
        account.deposit(amount);
        accountRepository.save(account);

        return account;
    }
}

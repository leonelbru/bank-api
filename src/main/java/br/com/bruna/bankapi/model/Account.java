package br.com.bruna.bankapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor
@Entity
@Getter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String accountNumber;
    private String agency;
    private BigDecimal balance;

    @OneToOne
    @JoinColumn(
            name = "customer_id",
            nullable = false,
            unique = true
    )
    private Customer customer;

    public Account(String accountNumber, String agency, Customer customer) {

        this.accountNumber = accountNumber;
        this.agency = agency;
        this.customer = customer;
        this.balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }
}
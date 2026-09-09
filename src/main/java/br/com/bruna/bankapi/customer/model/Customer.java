package br.com.bruna.bankapi.customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.util.UUID;

@NoArgsConstructor
@Getter
@Entity
public class Customer {
    private String name;
    private String cpf;
    private String email;
    private String phone;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    public Customer(String name, String cpf, String email, String phone) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
    }
}

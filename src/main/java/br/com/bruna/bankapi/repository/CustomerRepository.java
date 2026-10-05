package br.com.bruna.bankapi.repository;

import br.com.bruna.bankapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}

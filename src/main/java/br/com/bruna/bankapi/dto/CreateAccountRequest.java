package br.com.bruna.bankapi.dto;

import java.util.UUID;

public record CreateAccountRequest(
        String accountNumber,
        String agency,
        UUID customerId
) {

}
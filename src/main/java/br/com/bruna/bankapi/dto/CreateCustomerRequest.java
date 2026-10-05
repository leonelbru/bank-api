package br.com.bruna.bankapi.dto;

public record CreateCustomerRequest(
        String name,
        String cpf,
        String email,
        String phone
) {

}

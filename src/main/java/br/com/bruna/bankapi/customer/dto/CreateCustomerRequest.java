package br.com.bruna.bankapi.customer.dto;

public record CreateCustomerRequest(
        String name,
        String cpf,
        String email,
        String phone
) {

}

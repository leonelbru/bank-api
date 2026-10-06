package br.com.bruna.bankapi.dto;

import java.math.BigDecimal;

public record DepositRequest(
        BigDecimal amount
) {

}


package com.firefly.baas.dtos.accounts;

import lombok.Builder;

/**
 * DTO for account balance information.
 */
@Builder
public record BalanceAdapterDTO(
    Long walletId,
    double currentBalance,
    double authorizations,
    double authorizedBalance,
    String currency,
    String calculationDate
) {}
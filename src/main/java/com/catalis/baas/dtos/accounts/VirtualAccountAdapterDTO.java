package com.catalis.baas.dtos.accounts;

import lombok.Builder;

/**
 * DTO for virtual account creation operations.
 */
@Builder
public record VirtualAccountAdapterDTO(
    // Required
    String walletId,
    
    // Required
    Integer typeId
) {}
package com.catalis.baas.dtos.payins;

import lombok.Builder;

/**
 * DTO for payin creation operations.
 */
@Builder
public record PayinAdapterDTO(
    // Required
    String walletId,
    
    // Required
    String userId,
    
    // Required
    String paymentMethodId,
    
    // Required
    Double amount,
    
    // Required
    String currency
) {}
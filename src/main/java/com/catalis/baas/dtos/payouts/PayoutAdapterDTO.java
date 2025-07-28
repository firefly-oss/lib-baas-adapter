package com.catalis.baas.dtos.payouts;

import lombok.Builder;

/**
 * DTO for payout creation operations.
 */
@Builder
public record PayoutAdapterDTO(
    // Required
    Integer walletId,
    
    // Required
    String beneficiaryId,
    
    // Required
    Double amount,
    
    // Required
    String currency,
    
    // Required
    String label
) {}
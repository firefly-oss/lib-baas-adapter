package com.catalis.baas.dtos.accounts;

import lombok.Builder;

/**
 * DTO for wallet-to-wallet transfer operations.
 */
@Builder
public record W2WTransferDTO(
    // Required - Source wallet ID
    String walletId,
    
    // Required - Destination wallet ID
    String beneficiaryWalletId,
    
    // Required - Amount to transfer
    Float amount,
    
    // Required - Currency of the transfer
    String currency
) {}
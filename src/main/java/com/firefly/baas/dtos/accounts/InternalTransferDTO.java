package com.firefly.baas.dtos.accounts;

import lombok.Builder;

/**
 * DTO for wallet-to-wallet transfer operations.
 */
@Builder
public record InternalTransferDTO(
    // Required - Source wallet ID
    String walletId,

    Integer transferId,
    
    // Required - Destination wallet ID
    String beneficiaryWalletId,
    
    // Required - Amount to transfer
    Float amount,
    
    // Required - Currency of the transfer
    String currency
) {}
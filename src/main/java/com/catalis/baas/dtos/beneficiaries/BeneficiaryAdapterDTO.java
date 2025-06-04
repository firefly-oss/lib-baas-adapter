package com.catalis.baas.dtos.beneficiaries;

import lombok.Builder;

/**
 * DTO for beneficiary creation operations.
 */
@Builder
public record BeneficiaryAdapterDTO(
    // Required
    String userId,
    
    // Required
    String name,
    
    // Required
    String nickName,
    
    // Required
    String address,
    
    // Required
    String iban,
    
    // Required
    String bic,
    
    // Required
    Boolean usableForSct
) {}
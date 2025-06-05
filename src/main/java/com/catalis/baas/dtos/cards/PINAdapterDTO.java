package com.catalis.baas.dtos.cards;

import lombok.Builder;

/**
 * DTO for PIN operations.
 * Can be used for both setting and changing PIN.
 */
@Builder
public record PINAdapterDTO(
    String currentPIN,
    String newPIN,
    String confirmPIN
) {}
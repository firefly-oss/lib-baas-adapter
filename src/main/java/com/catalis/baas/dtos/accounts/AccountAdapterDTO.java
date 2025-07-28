package com.catalis.baas.dtos.accounts;

import lombok.Builder;

/**
 * DTO for account creation operations.
 */
@Builder
public record AccountAdapterDTO(
    // Required
    String walletTypeId,

    // Required
    Integer tariffId,

    // Required
    Integer userId,

    // Required
    String currency,

    // Required
    String eventName,

    String accessTag
) {}
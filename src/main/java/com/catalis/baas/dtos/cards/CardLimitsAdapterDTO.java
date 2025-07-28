package com.catalis.baas.dtos.cards;

import lombok.Builder;

/**
 * DTO for card limit operations.
 */
@Builder
public record CardLimitsAdapterDTO(
    Integer limitAtmYear,
    Integer limitAtmMonth,
    Integer limitPaymentYear
) {}
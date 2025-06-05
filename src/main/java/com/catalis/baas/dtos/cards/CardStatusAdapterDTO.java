package com.catalis.baas.dtos.cards;

import lombok.Builder;

/**
 * DTO for card status operations.
 */
@Builder
public record CardStatusAdapterDTO(
    Integer lockStatus
) {}
package com.firefly.baas.dtos.cards;

import lombok.Builder;

/**
 * DTO for card creation operations.
 * Can be used for both physical and virtual cards.
 */
@Builder
public record ActivateCardAdapterDTO(
    String accessTag
) {}
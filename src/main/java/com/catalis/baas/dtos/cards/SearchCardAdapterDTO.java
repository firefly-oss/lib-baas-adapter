package com.catalis.baas.dtos.cards;

import lombok.Builder;
import java.time.OffsetDateTime;

/**
 * DTO for card search operations.
 */
@Builder
public record SearchCardAdapterDTO(
    String accessTag,
    Integer cardId,
    Integer userId,
    String embossedName,
    String publicToken,
    String permsGroup,
    Integer isPhysical,
    Integer isConverted,
    Integer lockStatus,
    Integer mccRestrictionGroupId,
    Integer merchantRestrictionGroupId,
    Integer countryRestrictionGroupId,
    Integer pageNumber,
    Integer pageCount,
    String sortBy,
    String sortOrder,
    OffsetDateTime createdDateFrom,
    OffsetDateTime createdDateTo,
    OffsetDateTime updatedDateFrom,
    OffsetDateTime updatedDateTo
) {}
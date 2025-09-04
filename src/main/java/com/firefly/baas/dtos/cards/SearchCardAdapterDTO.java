/*
 * Copyright 2025 Firefly Software Solutions Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.firefly.baas.dtos.cards;

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
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


package com.firefly.baas.dtos.accounts;

import lombok.Builder;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * DTO for wallet search operations.
 */
@Builder
public record SearchAccountsAdapterDTO(
    String accessTag,
    Integer walletId,
    String walletStatus,
    Integer userId,
    Integer parentUserId,
    String walletTag,
    Integer walletTypeId,
    List<Integer> walletTypeIdList,
    Integer tariffId,
    Integer pageNumber,
    Integer pageCount,
    String sortBy,
    String sortOrder,
    OffsetDateTime createdDateFrom,
    OffsetDateTime createdDateTo,
    OffsetDateTime updatedDateFrom,
    OffsetDateTime updatedDateTo
) {}
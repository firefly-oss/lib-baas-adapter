package com.catalis.baas.dtos.accounts;

import lombok.Builder;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * DTO for wallet search operations.
 */
@Builder
public record SearchWalletAdapterDTO(
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
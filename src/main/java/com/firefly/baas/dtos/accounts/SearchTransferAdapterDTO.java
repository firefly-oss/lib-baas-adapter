package com.firefly.baas.dtos.accounts;

import lombok.Builder;
import java.time.OffsetDateTime;

/**
 * DTO for transfer search operations.
 */
@Builder
public record SearchTransferAdapterDTO(
    String accessTag,
    Integer transferId,
    String transferTag,
    String transferStatus,
    Integer walletId,
    Integer beneficiaryWalletId,
    Integer userId,
    Integer beneficiaryUserId,
    String amount,
    String currency,
    Integer transferTypeId,
    Integer pageNumber,
    Integer pageCount,
    String sortBy,
    String sortOrder,
    OffsetDateTime createdDateFrom,
    OffsetDateTime createdDateTo,
    OffsetDateTime updatedDateFrom,
    OffsetDateTime updatedDateTo
) {}
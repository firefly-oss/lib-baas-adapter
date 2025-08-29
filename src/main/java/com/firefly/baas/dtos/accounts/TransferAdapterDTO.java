package com.firefly.baas.dtos.accounts;

import lombok.Builder;
import java.time.OffsetDateTime;

/**
 * DTO for transfer operations.
 */
@Builder
public record TransferAdapterDTO(
    Long transferId,
    String transferStatus,
    String transferTag,
    Long walletId,
    Integer walletTypeId,
    Long beneficiaryWalletId,
    Integer beneficiaryWalletTypeId,
    String walletEventName,
    String walletAlias,
    String beneficiaryWalletEventName,
    String beneficiaryWalletAlias,
    String amount,
    String currency,
    String label,
    Integer transferTypeId,
    OffsetDateTime createdDate,
    OffsetDateTime modifiedDate,
    Integer totalRows,
    String foreignId,
    String partnerFee,
    String codeStatus,
    String informationStatus,
    String metadata
) {}
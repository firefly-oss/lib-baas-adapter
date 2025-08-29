package com.firefly.baas.dtos.documents;

import lombok.Builder;
import java.time.OffsetDateTime;

@Builder
public record DocumentInfoAdapterDTO(
    Long documentId,
    String documentTag,
    Long userId,
    String userFirstname,
    String userLastname,
    String name,
    String documentStatus,
    Integer documentTypeId,
    String documentType,
    String fileName,
    String thumbfileName,
    OffsetDateTime createdDate,
    OffsetDateTime modifiedDate,
    String codeStatus,
    String informationStatus,
    Long residenceId,
    String temporaryUrl,
    String temporaryUrlThumb
) {}
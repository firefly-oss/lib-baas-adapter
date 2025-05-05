package com.catalis.baas.dtos.documents;

import lombok.Builder;

@Builder
public record FrontDocumentDTO(
    Integer userId,

    byte[] fileContentBase64,

    Integer documentTypeId,

    String name
) {}

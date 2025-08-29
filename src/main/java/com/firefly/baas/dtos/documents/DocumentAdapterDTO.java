package com.firefly.baas.dtos.documents;

import lombok.Builder;

@Builder
public record DocumentAdapterDTO(
    Integer userId,

    byte[] fileContentBase64,

    Integer documentTypeId,

    String name
) {}

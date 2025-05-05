package com.catalis.baas.dtos.documents;

public record FrontDocumentDTO(
    Integer userId,

    byte[] fileContentBase64,

    Integer documentTypeId,

    String name
) {}

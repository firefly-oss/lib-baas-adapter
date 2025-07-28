package com.catalis.baas.dtos.customers;

import lombok.Builder;
import java.time.OffsetDateTime;

@Builder
public record SearchUserAdapterDTO(
    String accessTag,
    Integer userId,
    Integer userTypeId,
    String userStatus,
    String userTag,
    Integer specifiedUSPerson,
    Integer controllingPersonType,
    Integer employeeType,
    String email,
    String name,
    String legalName,
    String parentUserId,
    Integer pageNumber,
    Integer pageCount,
    String sortBy,
    String sortOrder,
    OffsetDateTime createdDateFrom,
    OffsetDateTime createdDateTo,
    OffsetDateTime updatedDateFrom,
    OffsetDateTime updatedDateTo
) {}
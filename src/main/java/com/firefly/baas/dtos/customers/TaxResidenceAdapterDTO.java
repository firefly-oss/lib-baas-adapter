package com.firefly.baas.dtos.customers;

import lombok.Builder;

@Builder
public record TaxResidenceAdapterDTO(
        Integer userId,
        String country,
        String taxPayerId
) {}

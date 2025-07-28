package com.catalis.baas.dtos.customers;

import lombok.Builder;

@Builder
public record KYCLivenessAdapterDTO(
    String redirectUrl
) {}

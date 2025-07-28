package com.catalis.baas.dtos.customers;

import lombok.Builder;

@Builder
public record NaturalPersonAdapterDTO(
    // Required
    int userTypeId,

    // Required
    int specifiedUSPerson,

    // Required & unique
    String email,

    String title,

    String firstname,

    // Keep the suffix to emulate VALIDATED status
    String lastname,

    String birthday,

    String placeOfBirth,

    String birthCountry,

    String nationality,

    String address1,

    String postcode,

    String city,

    String country,

    String phone,

    String incomeRange,

    String accessTag
) {}

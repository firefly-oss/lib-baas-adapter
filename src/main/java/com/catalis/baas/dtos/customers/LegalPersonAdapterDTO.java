package com.catalis.baas.dtos.customers;

import lombok.Builder;

@Builder
public record LegalPersonAdapterDTO(
    // Required
    int userTypeId,

    // Required
    int specifiedUSPerson,

    // Required & unique
    String email,

    String address1,

    String postcode,

    String city,

    String country,

    String phone,

    // Keep the suffix to emulate VALIDATED status
    String lastname,

    String legalName,

    String legalRegistrationNumber,

    String legalForm,

    String legalRegistrationDate,

    String legalSector,

    String legalAnnualTurnOver,

    String legalNetIncomeRange,

    String legalNumberOfEmployeeRange,

    String entityType,

    int activityOutsideEu,

    String accessTag,
    int controllingPersonType,
    int employeeType,
    int economicSanctions,
    int residentCountriesSanctions,
    int involvedSanctions,
    int entitySanctionsQuestionnaire,
    int isOnStockExchange,
    int occupationCategory,
    int personalAssetsRange,
    int monthlyIncomeRange
) {}

/*
 * Copyright 2025 Firefly Software Solutions Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.firefly.baas.dtos.customers;

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

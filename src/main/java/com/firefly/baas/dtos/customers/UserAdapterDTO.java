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
public record UserAdapterDTO(
    String userTag,
    String accessTag,
    int specifiedUSPerson,
    int controllingPersonType,
    int employeeType,
    String title,
    String firstname,
    String lastname,
    String middleNames,
    String birthday,
    String email,
    String address1,
    String address2,
    String address3,
    String postcode,
    String city,
    String state,
    String country,
    String distributionCountry,
    String secondaryAddress1,
    String secondaryAddress2,
    String secondaryAddress3,
    String secondaryPostcode,
    String secondaryCity,
    String secondaryState,
    String secondaryCountry,
    String phone,
    String mobile,
    String nationality,
    String nationalityOther,
    String placeOfBirth,
    String birthCountry,
    String occupation,
    String incomeRange,
    String legalName,
    String legalRegistrationNumber,
    String legalTvaNumber,
    String legalRegistrationDate,
    String legalForm,
    int legalShareCapital,
    String legalSector,
    String legalAnnualTurnOver,
    String legalNetIncomeRange,
    String legalNumberOfEmployeeRange,
    int effectiveBeneficiary,
    String language,
    String taxNumber,
    String taxResidence,
    String position,
    String personalAssets,
    int activityOutsideEu,
    int economicSanctions,
    int residentCountriesSanctions,
    int involvedSanctions,
    int entitySanctionsQuestionnaire,
    String timezone,
    String occupationType,
    String sourceOfFunds,
    String legalSectorType,
    int isOnStockExchange,
    int occupationCategory,
    int personalAssetsRange,
    int monthlyIncomeRange
) {}
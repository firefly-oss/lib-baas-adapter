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


package com.firefly.baas.dtos.cards;

import lombok.Builder;

/**
 * DTO for card creation operations.
 * Can be used for both physical and virtual cards.
 */
@Builder
public record CardAdapterDTO(
    // Required
    Integer userId,
    
    String accessTag,
    
    // Required
    Integer walletId,
    
    // Required
    String permsGroup,
    
    String cardTag,
    
    Integer batchDeliveryId,
    
    Integer limitAtmYear,
    
    Integer limitAtmMonth,
    
    // Required
    Integer limitAtmWeek,
    
    // Required
    Integer limitAtmDay,
    
    Integer limitAtmAll,
    
    Integer limitPaymentYear,
    
    Integer limitPaymentMonth,
    
    // Required
    Integer limitPaymentWeek,
    
    // Required
    Integer limitPaymentDay,
    
    Integer limitPaymentAll,
    
    Integer paymentDailyLimit,
    
    String pin,
    
    String cardPrint,
    
    Integer anonymous,
    
    Integer sendToParent,
    
    Integer mccRestrictionGroupId,
    
    Integer merchantRestrictionGroupId,
    
    Integer countryRestrictionGroupId,
    
    Boolean embossLegalName,
    
    String logoId,
    
    String logoBackId,
    
    String designCode,
    
    String packageId,
    
    Integer deliveryMethod,
    
    Integer pinMailer,
    
    String customizedInfo,
    
    String freeCustomizedInfo,
    
    String letterCustomizedInfo,
    
    String cardLanguages,
    
    // Indicates whether this is a physical or virtual card
    Boolean isVirtual
) {}
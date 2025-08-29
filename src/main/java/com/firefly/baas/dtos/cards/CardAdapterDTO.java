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
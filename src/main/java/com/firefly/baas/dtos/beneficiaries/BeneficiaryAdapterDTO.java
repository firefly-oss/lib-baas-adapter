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


package com.firefly.baas.dtos.beneficiaries;

import lombok.Builder;

/**
 * DTO for beneficiary creation operations.
 */
@Builder
public record BeneficiaryAdapterDTO(
    // Required
    String userId,
    
    // Required
    String name,
    
    // Required
    String nickName,
    
    // Required
    String address,
    
    // Required
    String iban,
    
    // Required
    String bic,
    
    // Required
    Boolean usableForSct
) {}
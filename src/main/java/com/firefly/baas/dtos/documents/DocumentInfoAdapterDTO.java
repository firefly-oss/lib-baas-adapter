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


package com.firefly.baas.dtos.documents;

import lombok.Builder;
import java.time.OffsetDateTime;

@Builder
public record DocumentInfoAdapterDTO(
    Long documentId,
    String documentTag,
    Long userId,
    String userFirstname,
    String userLastname,
    String name,
    String documentStatus,
    Integer documentTypeId,
    String documentType,
    String fileName,
    String thumbfileName,
    OffsetDateTime createdDate,
    OffsetDateTime modifiedDate,
    String codeStatus,
    String informationStatus,
    Long residenceId,
    String temporaryUrl,
    String temporaryUrlThumb
) {}
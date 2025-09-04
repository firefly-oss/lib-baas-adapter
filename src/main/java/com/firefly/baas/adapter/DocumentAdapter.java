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


package com.firefly.baas.adapter;


import com.firefly.baas.dtos.documents.DocumentAdapterDTO;
import com.firefly.baas.dtos.documents.DocumentInfoAdapterDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * Interface for document operations with document API.
 */
public interface DocumentAdapter {

    /**
     * Creates a new document associated with a user.
     *
     * @param document The details of the document to be created
     * @return The externalReferenceId of the document
     */
    Mono<ResponseEntity<DocumentAdapterDTO>> createDocument(DocumentAdapterDTO document);

    /**
     * Retrieves detailed information about a document.
     *
     * @param documentId The ID of the document to retrieve
     * @return A reactive Mono emitting a ResponseEntity containing the document information
     */
    Mono<ResponseEntity<DocumentInfoAdapterDTO>> getDocument(Long documentId);

    /**
     * Deletes a document by ID.
     *
     * @param documentId The ID of the document to delete
     * @return A reactive Mono emitting a ResponseEntity containing the response from the delete operation
     */
    Mono<ResponseEntity<Long>> deleteDocument(Long documentId);

}

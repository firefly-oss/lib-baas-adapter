package com.catalis.baas.adapter;


import com.catalis.baas.dtos.documents.DocumentAdapterDTO;
import com.catalis.baas.dtos.documents.DocumentInfoAdapterDTO;
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

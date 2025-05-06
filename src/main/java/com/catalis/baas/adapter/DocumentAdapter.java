package com.catalis.baas.adapter;


import com.catalis.baas.dtos.documents.DocumentAdapterDTO;
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
    Mono<ResponseEntity<String>> createDocument(DocumentAdapterDTO document);

}

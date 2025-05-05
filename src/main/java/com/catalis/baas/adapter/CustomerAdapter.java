package com.catalis.baas.adapter;


import com.catalis.baas.dtos.customers.FrontLegalPersonDTO;
import com.catalis.baas.dtos.customers.FrontNaturalPersonDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Interface for account operations with customers API.
 */
public interface CustomerAdapter {

    /**
     * Creates a new legal person.
     *
     * @param legalPerson The details of the legal person to be created
     * @return The externalReferenceId of the user
     */
    Mono<ResponseEntity<String>> createLegalPerson(FrontLegalPersonDTO legalPerson);

    /**
     * Creates a natural person.
     *
     * @param naturalPerson The details of the natural person to be created
     * @return The externalReferenceId of the user
     */
    Mono<ResponseEntity<String>> createNaturalPerson(FrontNaturalPersonDTO naturalPerson);

}

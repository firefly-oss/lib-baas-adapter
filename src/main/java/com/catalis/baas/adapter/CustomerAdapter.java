package com.catalis.baas.adapter;


import com.catalis.baas.dtos.customers.LegalPersonAdapterDTO;
import com.catalis.baas.dtos.customers.NaturalPersonAdapterDTO;
import com.catalis.baas.dtos.customers.TaxResidenceAdapterDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

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
    Mono<ResponseEntity<String>> createLegalPerson(LegalPersonAdapterDTO legalPerson);

    /**
     * Creates a natural person.
     *
     * @param naturalPerson The details of the natural person to be created
     * @return The externalReferenceId of the user
     */
    Mono<ResponseEntity<String>> createNaturalPerson(NaturalPersonAdapterDTO naturalPerson);

    /**
     * Creates a new tax residence for a user.
     *
     * @param taxResidence The details of the tax residence to be created,
     *                     including user ID, country, and taxpayer identification number.
     * @return A reactive Mono emitting a ResponseEntity containing the externalReferenceId of the tax residence.
     */
    Mono<ResponseEntity<String>> createTaxResidence(TaxResidenceAdapterDTO taxResidence);

}

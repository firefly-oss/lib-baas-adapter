package com.catalis.baas.adapter;


import com.catalis.baas.dtos.customers.KYCLivenessAdapterDTO;
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

    /**
     * Requests Know Your Customer verification for a user.
     *
     * @param userId The ID of the user to verify
     * @return A reactive Mono emitting a ResponseEntity containing the response from the KYC request
     */
    Mono<ResponseEntity<String>> requestKYC(Integer userId);

    /**
     * Requests Know Your Business verification for a user.
     *
     * @param userId The ID of the user to verify
     * @return A reactive Mono emitting a ResponseEntity containing the response from the KYB request
     */
    Mono<ResponseEntity<String>> requestKYB(Integer userId);

    /**
     * Performs a liveness check for KYC (Know Your Customer) verification.
     *
     * @param userId The ID of the user for whom the liveness check is performed
     * @return A reactive Mono emitting a ResponseEntity containing the response from the liveness check
     */
    Mono<ResponseEntity<String>> kycLiveness(Integer userId, KYCLivenessAdapterDTO kycLiveness);

}

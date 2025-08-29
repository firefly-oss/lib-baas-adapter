package com.firefly.baas.adapter;

import com.firefly.baas.dtos.beneficiaries.BeneficiaryAdapterDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * Interface for beneficiary operations with provider API.
 */
public interface BeneficiaryAdapter {

    /**
     * Creates a new beneficiary.
     *
     * @param beneficiaryDTO The details of the beneficiary to be created
     * @return A reactive Mono emitting a ResponseEntity containing the response from the beneficiary creation
     */
    Mono<ResponseEntity<String>> createBeneficiary(BeneficiaryAdapterDTO beneficiaryDTO);

}
package com.firefly.baas.adapter;

import com.firefly.baas.dtos.payins.PayinAdapterDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * Interface for payin operations with provider API.
 */
public interface PayinAdapter {

    /**
     * Creates a new payin.
     *
     * @param payinDTO The details of the payin to be created
     * @return A reactive Mono emitting a ResponseEntity containing the response from the payin creation
     */
    Mono<ResponseEntity<PayinAdapterDTO>> createPayin(PayinAdapterDTO payinDTO);

}
package com.firefly.baas.adapter;

import com.firefly.baas.dtos.payouts.PayoutAdapterDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * Interface for payout operations with provider API.
 */
public interface PayoutAdapter {

    /**
     * Creates a new payout.
     *
     * @param payoutDTO The details of the payout to be created
     * @return A reactive Mono emitting a ResponseEntity containing the response from the payout creation
     */
    Mono<ResponseEntity<PayoutAdapterDTO>> createPayout(PayoutAdapterDTO payoutDTO);

}
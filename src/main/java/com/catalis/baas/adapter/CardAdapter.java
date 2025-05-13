package com.catalis.baas.adapter;


import com.catalis.baas.dtos.cards.CardAdapterDTO;
import com.catalis.baas.dtos.cards.ValidateCardAdapterDTO;
import com.catalis.core.banking.cards.interfaces.dtos.card.v1.CardDTO;
import com.catalis.core.banking.cards.interfaces.dtos.security.v1.CardSecurityDTO;
import com.catalis.core.banking.cards.interfaces.dtos.transaction.v1.CardTransactionDTO;
import com.catalis.core.banking.cards.interfaces.dtos.virtual.v1.VirtualCardDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Interface for card operations with provider API.
 */
public interface CardAdapter {

    /**
     * Creates a new physical card.
     *
     * @param cardDTO The details of the physical card to be created
     * @return A reactive Mono emitting a ResponseEntity containing the response from the card creation
     */
    Mono<ResponseEntity<String>> createPhysicalCard(CardAdapterDTO cardDTO);

    /**
     * Creates a new virtual card.
     *
     * @param cardDTO The details of the virtual card to be created
     * @return A reactive Mono emitting a ResponseEntity containing the response from the card creation
     */
    Mono<ResponseEntity<String>> createVirtualCard(CardAdapterDTO cardDTO);

    /**
     * Validates the given card with the specified card details.
     *
     * @param cardId The unique identifier of the card to be validated
     * @param validateCardAdapterDTO The details required for card validation, including access tag information
     * @return A reactive Mono emitting a ResponseEntity containing the result of the card validation
     */
    Mono<ResponseEntity<String>> validateCard(Integer cardId, ValidateCardAdapterDTO validateCardAdapterDTO);

}

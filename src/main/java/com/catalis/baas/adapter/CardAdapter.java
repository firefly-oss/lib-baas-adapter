package com.catalis.baas.adapter;


import com.catalis.baas.dtos.cards.CardAdapterDTO;
import com.catalis.baas.dtos.cards.ActivateCardAdapterDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

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
     * Activates the given card with the specified card details.
     *
     * @param cardId The unique identifier of the card to be activated
     * @param activateCardDTO The details required for card activation, including access tag information
     * @return A reactive Mono emitting a ResponseEntity containing the result of the card activation
     */
    Mono<ResponseEntity<String>> activateCard(Integer cardId, ActivateCardAdapterDTO activateCardDTO);

}

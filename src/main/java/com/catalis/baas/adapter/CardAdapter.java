package com.catalis.baas.adapter;


import com.catalis.baas.dtos.cards.CardAdapterDTO;
import com.catalis.baas.dtos.cards.ActivateCardAdapterDTO;
import com.catalis.baas.dtos.cards.CardLimitsAdapterDTO;
import com.catalis.baas.dtos.cards.CardStatusAdapterDTO;
import com.catalis.baas.dtos.cards.PINAdapterDTO;
import com.catalis.baas.dtos.cards.SearchCardAdapterDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import java.util.List;

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

    /**
     * Sets the PIN for a card.
     *
     * @param cardId The unique identifier of the card
     * @param pinDTO The PIN details including current, new, and confirmation PINs
     * @return A reactive Mono emitting a ResponseEntity containing the result of the PIN setting operation
     */
    Mono<ResponseEntity<String>> setPIN(Long cardId, PINAdapterDTO pinDTO);

    /**
     * Changes the PIN for a card.
     *
     * @param cardId The unique identifier of the card
     * @param pinDTO The PIN details including current, new, and confirmation PINs
     * @return A reactive Mono emitting a ResponseEntity containing the result of the PIN change operation
     */
    Mono<ResponseEntity<String>> changePIN(Long cardId, PINAdapterDTO pinDTO);

    /**
     * Sets the limits for a card.
     *
     * @param cardId The unique identifier of the card
     * @param limitsDTO The card limits details including ATM and payment limits
     * @return A reactive Mono emitting a ResponseEntity containing the result of the limits setting operation
     */
    Mono<ResponseEntity<String>> setLimits(Long cardId, CardLimitsAdapterDTO limitsDTO);

    /**
     * Changes the status of a card.
     *
     * @param cardId The unique identifier of the card
     * @param statusDTO The card status details including lock status
     * @return A reactive Mono emitting a ResponseEntity containing the result of the status change operation
     */
    Mono<ResponseEntity<String>> changeStatus(Long cardId, CardStatusAdapterDTO statusDTO);

    /**
     * Retrieves a card by ID.
     *
     * @param cardId The unique identifier of the card to retrieve
     * @return A reactive Mono emitting a ResponseEntity containing the card information
     */
    Mono<ResponseEntity<CardAdapterDTO>> getCard(Long cardId);

    /**
     * Searches for cards based on the provided criteria.
     *
     * @param searchCriteria The search criteria to apply
     * @return A reactive Mono emitting a ResponseEntity containing a list of cards matching the criteria
     */
    Mono<ResponseEntity<List<CardAdapterDTO>>> searchCards(SearchCardAdapterDTO searchCriteria);
}

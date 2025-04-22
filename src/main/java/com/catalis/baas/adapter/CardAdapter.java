package com.catalis.baas.adapter;


import com.catalis.core.banking.cards.interfaces.dtos.card.v1.CardDTO;
import com.catalis.core.banking.cards.interfaces.dtos.security.v1.CardSecurityDTO;
import com.catalis.core.banking.cards.interfaces.dtos.transaction.v1.CardTransactionDTO;
import com.catalis.core.banking.cards.interfaces.dtos.virtual.v1.VirtualCardDTO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Interface for card operations with provider API.
 */
public interface CardAdapter {

    /**
     * Create a new card.
     *
     * @param card The card details
     * @return The created card
     */
    CardDTO createCard(CardDTO card);

    /**
     * Create a virtual card.
     *
     * @param card The card details
     * @return The created virtual card
     */
    CardDTO createVirtualCard(CardDTO card);

    /**
     * Request a physical card.
     *
     * @param card The card details
     * @return The requested physical card
     */
    CardDTO requestPhysicalCard(CardDTO card);

    /**
     * Get card by ID.
     *
     * @param cardId The card ID
     * @return The card details
     */
    CardDTO getCard(String cardId);

    /**
     * Get cards by wallet ID.
     *
     * @param walletId The wallet ID
     * @return List of cards
     */
    List<CardDTO> getCardsByWallet(String walletId);

    /**
     * Get cards by user ID.
     *
     * @param userId The user ID
     * @return List of cards
     */
    List<CardDTO> getCardsByUser(String userId);

    /**
     * Get card status.
     *
     * @param cardId The card ID
     * @return The card status
     */
    CardSecurityDTO getCardStatus(String cardId);

    /**
     * Update card status.
     *
     * @param cardId The card ID
     * @param status The new status
     * @return The updated card status
     */
    CardSecurityDTO updateCardStatus(String cardId, String status);

    /**
     * Activate a card.
     *
     * @param cardId The card ID
     * @return The activated card
     */
    CardDTO activateCard(String cardId);

    /**
     * Activate a card using public token.
     *
     * @param cardToken The card token
     * @param activationCode The activation code
     * @return The activated card
     */
    CardDTO activateCardWithToken(String cardToken, String activationCode);

    /**
     * Assign a card to a user.
     *
     * @param cardId The card ID
     * @param userId The user ID
     * @return The updated card
     */
    CardDTO assignCardToUser(String cardId, String userId);

    /**
     * Assign a card to a wallet.
     *
     * @param cardId The card ID
     * @param walletId The wallet ID
     * @return The updated card
     */
    CardDTO assignCardToWallet(String cardId, String walletId);

    /**
     * Change the PIN of a card.
     *
     * @param cardId The card ID
     * @param newPin The new PIN
     * @return True if the PIN was changed successfully
     */
    boolean changeCardPin(String cardId, String newPin);

    /**
     * Convert a physical card to virtual.
     *
     * @param cardId The card ID
     * @return The converted card
     */
    CardDTO convertToVirtualCard(String cardId);

    /**
     * Set card limits.
     *
     * @param cardId The card ID
     * @param limits Map of limit types and values
     * @return The updated card
     */
    CardDTO setCardLimits(String cardId, Map<String, Object> limits);

    /**
     * Lock or unlock a card.
     *
     * @param cardId The card ID
     * @param locked True to lock, false to unlock
     * @return The updated card status
     */
    CardSecurityDTO lockUnlockCard(String cardId, boolean locked);

    /**
     * Set card options.
     *
     * @param cardId The card ID
     * @param options Map of option types and values
     * @return The updated card
     */
    CardDTO setCardOptions(String cardId, Map<String, Boolean> options);

    /**
     * Regenerate a card.
     *
     * @param cardId The card ID
     * @return The regenerated card
     */
    CardDTO regenerateCard(String cardId);

    /**
     * Register a card for 3DS.
     *
     * @param cardId The card ID
     * @param phoneNumber The phone number for 3DS
     * @return True if registration was successful
     */
    boolean registerCardFor3DS(String cardId, String phoneNumber);

    /**
     * Get card transactions.
     *
     * @param cardId The card ID
     * @param startDate The start date for transactions
     * @param endDate The end date for transactions
     * @return List of card transactions
     */
    List<CardTransactionDTO> getCardTransactions(String cardId, Date startDate, Date endDate);

    /**
     * Get digitized cards for a physical or virtual card.
     *
     * @param cardId The card ID
     * @return List of digitized cards
     */
    List<VirtualCardDTO> getDigitizedCards(String cardId);

    /**
     * Update the status of a digitized card.
     *
     * @param digitizedCardId The digitized card ID
     * @param status The new status (suspend, unsuspend)
     * @param reasonCode The reason code for the action (F, L, S, T, Z)
     * @return The updated digitized card
     */
    VirtualCardDTO updateDigitizedCardStatus(String digitizedCardId, String status, String reasonCode);

    /**
     * Deactivate a digitized card.
     *
     * @param digitizedCardId The digitized card ID
     * @param reasonCode The reason code for the action
     * @return True if deactivation was successful
     */
    boolean deactivateDigitizedCard(String digitizedCardId, String reasonCode);
}

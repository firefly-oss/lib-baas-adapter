package com.catalis.baas.adapter;


import com.catalis.core.banking.payments.interfaces.dtos.manager.core.v1.PaymentOrderDTO;
import com.catalis.core.banking.payments.interfaces.dtos.payments.common.v1.PaymentOperationResponseDTO;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Interface for payment operations with provider API.
 */
public interface PaymentAdapter {

    /**
     * Create a new payment.
     *
     * @param payment The payment details
     * @return The created payment
     */
    PaymentOrderDTO createPayment(PaymentOrderDTO payment);

    /**
     * Create a SEPA credit transfer payment.
     *
     * @param payment The payment details
     * @return The created payment
     */
    PaymentOrderDTO createSepaCreditTransferPayment(PaymentOrderDTO payment);

    /**
     * Create a SEPA instant credit transfer payment.
     *
     * @param payment The payment details
     * @return The created payment
     */
    PaymentOrderDTO createSepaInstantCreditTransferPayment(PaymentOrderDTO payment);

    /**
     * Create a mass payment (batch payment).
     *
     * @param payments List of payment details
     * @return Map of payment IDs to created payments
     */
    Map<String, PaymentOrderDTO> createMassPayment(List<PaymentOrderDTO> payments);

    /**
     * Get payment by ID.
     *
     * @param paymentId The payment ID
     * @return The payment details
     */
    PaymentOrderDTO getPayment(String paymentId);

    /**
     * Get payments by filter criteria.
     *
     * @param filters Map of filter criteria
     * @return List of payments matching the criteria
     */
    List<PaymentOrderDTO> getPayments(Map<String, Object> filters);

    /**
     * Get payments by wallet ID.
     *
     * @param walletId The wallet ID
     * @return List of payments
     */
    List<PaymentOrderDTO> getPaymentsByWallet(String walletId);

    /**
     * Get payments by user ID.
     *
     * @param userId The user ID
     * @return List of payments
     */
    List<PaymentOrderDTO> getPaymentsByUser(String userId);

    /**
     * Get payments by date range.
     *
     * @param startDate The start date
     * @param endDate The end date
     * @return List of payments
     */
    List<PaymentOrderDTO> getPaymentsByDateRange(Date startDate, Date endDate);

    /**
     * Get payment status.
     *
     * @param paymentId The payment ID
     * @return The payment status
     */
    PaymentOperationResponseDTO getPaymentStatus(String paymentId);

    /**
     * Cancel a payment.
     *
     * @param paymentId The payment ID
     * @return True if cancellation was successful
     */
    boolean cancelPayment(String paymentId);

    /**
     * Get proof of payment.
     *
     * @param paymentId The payment ID
     * @return PDF document as input stream
     */
    InputStream getPaymentProof(String paymentId);

    /**
     * Create a scheduled payment.
     *
     * @param payment The payment details
     * @param scheduledDate The scheduled date for the payment
     * @param recurrence The recurrence pattern (null for one-time)
     * @return The created scheduled payment
     */
    PaymentOrderDTO createScheduledPayment(PaymentOrderDTO payment, Date scheduledDate, String recurrence);

    /**
     * Get scheduled payments.
     *
     * @param walletId The wallet ID (optional)
     * @return List of scheduled payments
     */
    List<PaymentOrderDTO> getScheduledPayments(String walletId);

    /**
     * Cancel a scheduled payment.
     *
     * @param scheduledPaymentId The scheduled payment ID
     * @return True if cancellation was successful
     */
    boolean cancelScheduledPayment(String scheduledPaymentId);
}

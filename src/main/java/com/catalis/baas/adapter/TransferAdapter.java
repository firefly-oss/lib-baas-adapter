package com.catalis.baas.adapter;


import com.catalis.baas.dtos.accounts.*;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Interface for account operations with provider API.
 */
public interface TransferAdapter {


    /**
     * Transfer funds from one account to another.
     *
     * @param internalTransferDTO The account-to-account transfer data
     * @return Response entity with transfer result
     */
    Mono<ResponseEntity<InternalTransferDTO>> internalTransfer(InternalTransferDTO internalTransferDTO);

    /**
     * Cancels a transfer by ID.
     *
     * @param transferId The ID of the transfer to cancel
     * @return A reactive Mono emitting a ResponseEntity containing the response from the cancel operation
     */
    Mono<ResponseEntity<Long>> cancelTransfer(Long transferId);

    /**
     * Retrieves a transfer by ID.
     *
     * @param transferId The ID of the transfer to retrieve
     * @return A reactive Mono emitting a ResponseEntity containing the transfer information
     */
    Mono<ResponseEntity<TransferAdapterDTO>> getTransfer(Long transferId);

    /**
     * Searches for transfers based on the provided criteria.
     *
     * @param searchCriteria The search criteria to apply
     * @return A reactive Mono emitting a ResponseEntity containing a list of transfers matching the criteria
     */
    Flux<ResponseEntity<TransferAdapterDTO>> searchTransfers(SearchTransferAdapterDTO searchCriteria);
}

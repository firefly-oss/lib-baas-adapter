/*
 * Copyright 2025 Firefly Software Solutions Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.firefly.baas.adapter;


import com.firefly.baas.dtos.accounts.*;
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

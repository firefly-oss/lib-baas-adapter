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


import com.firefly.baas.dtos.accounts.AccountAdapterDTO;
import com.firefly.baas.dtos.accounts.SearchAccountsAdapterDTO;
import com.firefly.baas.dtos.accounts.VirtualAccountAdapterDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Interface for account operations with provider API.
 */
public interface AccountAdapter {

    /**
     * Create a new account.
     *
     * @param accountDTO The account creation data
     * @return Account details DTO
     */
    Mono<ResponseEntity<AccountAdapterDTO>> createAccount(AccountAdapterDTO accountDTO);

    /**
     * Create a new virtual account.
     *
     * @param virtualAccountDTO The virtual account creation data
     * @return Account details DTO
     */
    Mono<ResponseEntity<VirtualAccountAdapterDTO>> createVirtualAccount(VirtualAccountAdapterDTO virtualAccountDTO);

    /**
     * Searches for wallets based on the provided criteria.
     *
     * @param searchCriteria The search criteria to apply
     * @return A reactive Mono emitting a ResponseEntity containing the search results
     */
    Flux<ResponseEntity<AccountAdapterDTO>> searchAccounts(SearchAccountsAdapterDTO searchCriteria);

    /**
     * Deletes an account by ID.
     *
     * @param accountId The ID of the account to delete
     * @param origin The origin of the delete request
     * @return A reactive Mono emitting a ResponseEntity containing the response from the delete operation
     */
    Mono<ResponseEntity<Long>> deleteAccount(Long accountId, String origin);

}

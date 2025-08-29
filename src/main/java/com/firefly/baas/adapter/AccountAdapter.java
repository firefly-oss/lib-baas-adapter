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

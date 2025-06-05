package com.catalis.baas.adapter;


import com.catalis.baas.dtos.accounts.AccountAdapterDTO;
import com.catalis.baas.dtos.accounts.SearchTransferAdapterDTO;
import com.catalis.baas.dtos.accounts.SearchWalletAdapterDTO;
import com.catalis.baas.dtos.accounts.TransferAdapterDTO;
import com.catalis.baas.dtos.accounts.VirtualAccountAdapterDTO;
import com.catalis.baas.dtos.accounts.W2WTransferDTO;
import com.catalis.core.banking.accounts.interfaces.dtos.core.v1.AccountBalanceDTO;
import com.catalis.core.banking.accounts.interfaces.dtos.core.v1.AccountDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

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
    Mono<ResponseEntity<String>> createAccount(AccountAdapterDTO accountDTO);

    /**
     * Create a new virtual account.
     *
     * @param virtualAccountDTO The virtual account creation data
     * @return Account details DTO
     */
    Mono<ResponseEntity<String>> createVirtualAccount(VirtualAccountAdapterDTO virtualAccountDTO);

    /**
     * Transfer funds from one wallet to another.
     *
     * @param w2wTransferDTO The wallet-to-wallet transfer data
     * @return Response entity with transfer result
     */
    Mono<ResponseEntity<String>> walletToWalletTransfer(W2WTransferDTO w2wTransferDTO);

    /**
     * Searches for wallets based on the provided criteria.
     *
     * @param searchCriteria The search criteria to apply
     * @return A reactive Mono emitting a ResponseEntity containing the search results
     */
    Mono<ResponseEntity<AccountAdapterDTO>> searchWallets(SearchWalletAdapterDTO searchCriteria);

    /**
     * Deletes an account by ID.
     *
     * @param accountId The ID of the account to delete
     * @param origin The origin of the delete request
     * @return A reactive Mono emitting a ResponseEntity containing the response from the delete operation
     */
    Mono<ResponseEntity<String>> deleteAccount(Long accountId, String origin);

    /**
     * Cancels a transfer by ID.
     *
     * @param transferId The ID of the transfer to cancel
     * @return A reactive Mono emitting a ResponseEntity containing the response from the cancel operation
     */
    Mono<ResponseEntity<String>> cancelTransfer(Long transferId);

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
    Mono<ResponseEntity<List<TransferAdapterDTO>>> searchTransfers(SearchTransferAdapterDTO searchCriteria);
}

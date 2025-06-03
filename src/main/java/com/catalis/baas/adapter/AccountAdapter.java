package com.catalis.baas.adapter;


import com.catalis.baas.dtos.accounts.AccountAdapterDTO;
import com.catalis.baas.dtos.accounts.VirtualAccountAdapterDTO;
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

}

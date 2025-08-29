package com.firefly.baas.adapter;


import com.firefly.core.banking.accounts.interfaces.dtos.core.v1.AccountBalanceDTO;
import com.firefly.core.banking.accounts.interfaces.dtos.core.v1.AccountDTO;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Interface for account operations with provider API.
 */
public interface AuthenticationAdapter {

    /**
     * Retrieves an authentication token.
     *
     * @return A string representing the authentication token.
     */
    String getToken();
}

package com.catalis.baas.adapter;


import com.catalis.core.banking.accounts.interfaces.dtos.core.v1.AccountBalanceDTO;
import com.catalis.core.banking.accounts.interfaces.dtos.core.v1.AccountDTO;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Interface for account operations with provider API.
 */
public interface AccountAdapter {

    /**
     * Get account details for a wallet.
     *
     * @param walletId The wallet ID
     * @return Account details DTO
     */
    AccountDTO getAccountDetails(String walletId);

    /**
     * Get account details PDF for a wallet.
     *
     * @param walletId The wallet ID
     * @return PDF document as input stream
     */
    InputStream getAccountDetailsPdf(String walletId);

    /**
     * Get account statement for a wallet.
     *
     * @param walletId The wallet ID
     * @param month The month (1-12)
     * @param year The year
     * @return List of account balances
     */
    List<AccountBalanceDTO> getAccountStatement(String walletId, Integer month, Integer year);

    /**
     * Get account statement PDF for a wallet.
     *
     * @param walletId The wallet ID
     * @param month The month (1-12)
     * @param year The year
     * @return PDF document as input stream
     */
    InputStream getAccountStatementPdf(String walletId, Integer month, Integer year);

    /**
     * Get account balance for a wallet.
     *
     * @param walletId The wallet ID
     * @return Account balance DTO
     */
    AccountBalanceDTO getAccountBalance(String walletId);

    /**
     * Get account transactions for a wallet.
     *
     * @param walletId The wallet ID
     * @param startDate The start date for transactions
     * @param endDate The end date for transactions
     * @return List of account balances with transactions
     */
    List<AccountBalanceDTO> getAccountTransactions(String walletId, Date startDate, Date endDate);
}

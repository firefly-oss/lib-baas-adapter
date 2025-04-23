package com.catalis.baas.adapter;


import com.catalis.core.banking.accounts.interfaces.dtos.core.v1.AccountBalanceDTO;
import com.catalis.core.banking.accounts.interfaces.dtos.core.v1.AccountDTO;
import com.catalis.core.customers.interfaces.dtos.person.v1.LegalPersonDTO;
import com.catalis.core.customers.interfaces.dtos.person.v1.NaturalPersonDTO;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Interface for account operations with customers API.
 */
public interface CustomerAdapter {

    /**
     * Creates a new legal person.
     *
     * @param legalPerson The details of the legal person to be created
     * @return The created legal person as a DTO
     */
    LegalPersonDTO createLegalPerson(LegalPersonDTO legalPerson);

    /**
     * Creates a natural person.
     *
     * @param legalPerson The details of the natural person to be created
     * @return The created natural person's details
     */
    NaturalPersonDTO createNaturalPerson(NaturalPersonDTO legalPerson);

}

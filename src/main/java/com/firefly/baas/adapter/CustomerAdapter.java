package com.firefly.baas.adapter;


import com.firefly.baas.dtos.customers.KYCLivenessAdapterDTO;
import com.firefly.baas.dtos.customers.LegalPersonAdapterDTO;
import com.firefly.baas.dtos.customers.NaturalPersonAdapterDTO;
import com.firefly.baas.dtos.customers.SearchUserAdapterDTO;
import com.firefly.baas.dtos.customers.TaxResidenceAdapterDTO;
import com.firefly.baas.dtos.customers.UserAdapterDTO;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Interface for account operations with customers API.
 */
public interface CustomerAdapter {

    /**
     * Creates a new legal person.
     *
     * @param legalPerson The details of the legal person to be created
     * @return The externalReferenceId of the user
     */
    Mono<ResponseEntity<LegalPersonAdapterDTO>> createLegalPerson(LegalPersonAdapterDTO legalPerson);

    /**
     * Creates a natural person.
     *
     * @param naturalPerson The details of the natural person to be created
     * @return The externalReferenceId of the user
     */
    Mono<ResponseEntity<NaturalPersonAdapterDTO>> createNaturalPerson(NaturalPersonAdapterDTO naturalPerson);

    /**
     * Creates a new tax residence for a user.
     *
     * @param taxResidence The details of the tax residence to be created,
     *                     including user ID, country, and taxpayer identification number.
     * @return A reactive Mono emitting a ResponseEntity containing the externalReferenceId of the tax residence.
     */
    Mono<ResponseEntity<TaxResidenceAdapterDTO>> createTaxResidence(TaxResidenceAdapterDTO taxResidence);

    /**
     * Requests Know Your Customer verification for a user.
     *
     * @param userId The ID of the user to verify
     * @return A reactive Mono emitting a ResponseEntity containing the response from the KYC request
     */
    Mono<ResponseEntity<String>> requestKYC(Integer userId);

    /**
     * Requests Know Your Business verification for a user.
     *
     * @param userId The ID of the user to verify
     * @return A reactive Mono emitting a ResponseEntity containing the response from the KYB request
     */
    Mono<ResponseEntity<String>> requestKYB(Integer userId);

    /**
     * Performs a liveness check for KYC (Know Your Customer) verification.
     *
     * @param userId The ID of the user for whom the liveness check is performed
     * @return A reactive Mono emitting a ResponseEntity containing the response from the liveness check
     */
    Mono<ResponseEntity<String>> kycLiveness(Integer userId, KYCLivenessAdapterDTO kycLiveness);

    /**
     * Retrieves a user by ID.
     *
     * @param idUser The ID of the user to retrieve
     * @return A reactive Mono emitting a ResponseEntity containing the user information
     */
    Mono<ResponseEntity<NaturalPersonAdapterDTO>> getNaturalPerson(Long idUser);

    Mono<ResponseEntity<LegalPersonAdapterDTO>> getLegalPerson(Long idUser);

    /**
     * Deletes a user by ID.
     *
     * @param idUser The ID of the user to delete
     * @param origin The origin of the delete request
     * @return A reactive Mono emitting a ResponseEntity containing the response from the delete operation
     */
    Mono<ResponseEntity<Long>> deleteUser(Long idUser, String origin);

    /**
     * Updates a user's information.
     *
     * @param idUser The ID of the user to update
     * @param user The updated user information
     * @return A reactive Mono emitting a ResponseEntity containing the response from the update operation
     */
    Mono<ResponseEntity<UserAdapterDTO>> editUser(Long idUser, UserAdapterDTO user);

    /**
     * Searches for users based on the provided criteria.
     *
     * @param searchCriteria The search criteria to apply
     * @return A reactive Mono emitting a ResponseEntity containing the search results
     */
    Flux<ResponseEntity<LegalPersonAdapterDTO>> searchLegalUsers(SearchUserAdapterDTO searchCriteria);

    /**
     * Searches for users based on the provided criteria.
     *
     * @param searchCriteria The search criteria to apply
     * @return A reactive Mono emitting a ResponseEntity containing the search results
     */
    Flux<ResponseEntity<NaturalPersonAdapterDTO>> searchNaturalUsers(SearchUserAdapterDTO searchCriteria);

}

# BaaS Adapter Library

![Build Status](https://img.shields.io/github/workflow/status/firefly-oss/lib-baas-adapter/Publish%20to%20GitHub%20Packages?style=flat-square)
![Version](https://img.shields.io/badge/version-1.0.0--SNAPSHOT-blue?style=flat-square)
![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=java)
![License](https://img.shields.io/badge/license-Proprietary-red?style=flat-square)

## 📑 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Adapter Interfaces](#adapter-interfaces)
  - [AccountAdapter](#accountadapter)
  - [AuthenticationAdapter](#authenticationadapter)
  - [BeneficiaryAdapter](#beneficiaryadapter)
  - [CardAdapter](#cardadapter)
  - [CustomerAdapter](#customeradapter)
  - [DocumentAdapter](#documentadapter)
  - [PayoutAdapter](#payoutadapter)
- [Usage Example](#usage-example)
- [Implementation](#implementation)
- [Development](#development)
  - [Requirements](#requirements)
  - [Building](#building)
  - [Testing](#testing)
- [License](#license)
- [Contributing](#contributing)
- [Support](#support)

## 📋 Overview

The BaaS (Banking as a Service) Adapter Library provides a standardized interface for interacting with various Banking as a Service providers. This library defines a set of adapter interfaces that abstract the underlying provider-specific implementations, allowing for seamless integration with different BaaS platforms.

The library is designed with a reactive programming model using Spring WebFlux, returning `Mono<ResponseEntity<String>>` for most operations to support non-blocking, asynchronous processing.

## 🚀 Features

- Standardized interfaces for common banking operations
- Reactive programming model with Spring WebFlux
- Support for accounts, cards, customers, documents, payouts, and more
- Clean separation between interface and implementation

## 🔧 Installation

Add the dependency to your Maven project:

```xml
<dependency>
    <groupId>com.firefly</groupId>
    <artifactId>lib-baas-adapter</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## 📚 Adapter Interfaces

The library provides the following adapter interfaces:

### AccountAdapter

Interface for account operations with provider API.

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `createAccount` | Creates a new account | `AccountAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `createVirtualAccount` | Creates a new virtual account | `VirtualAccountAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `walletToWalletTransfer` | Transfers funds between wallets | `W2WTransferDTO` | `Mono<ResponseEntity<String>>` |
| `searchWallets` | Searches for wallets based on criteria | `SearchWalletAdapterDTO` | `Mono<ResponseEntity<AccountAdapterDTO>>` |
| `deleteAccount` | Deletes an account | `Long accountId, String origin` | `Mono<ResponseEntity<String>>` |
| `cancelTransfer` | Cancels a transfer | `Long transferId` | `Mono<ResponseEntity<String>>` |
| `getTransfer` | Retrieves transfer information | `Long transferId` | `Mono<ResponseEntity<TransferAdapterDTO>>` |
| `searchTransfers` | Searches for transfers based on criteria | `SearchTransferAdapterDTO` | `Mono<ResponseEntity<List<TransferAdapterDTO>>>` |
| `getAccountBalances` | Retrieves account balances | `Long walletId, Long userId` | `Mono<ResponseEntity<List<BalanceAdapterDTO>>>` |

### AuthenticationAdapter

Interface for authentication operations with provider API.

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `getToken` | Retrieves an authentication token | None | `String` |

### BeneficiaryAdapter

Interface for beneficiary operations with provider API.

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `createBeneficiary` | Creates a new beneficiary | `BeneficiaryAdapterDTO` | `Mono<ResponseEntity<String>>` |

### CardAdapter

Interface for card operations with provider API.

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `createPhysicalCard` | Creates a new physical card | `CardAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `createVirtualCard` | Creates a new virtual card | `CardAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `activateCard` | Activates a card | `Integer cardId, ActivateCardAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `setPIN` | Sets the PIN for a card | `Long cardId, PINAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `changePIN` | Changes the PIN for a card | `Long cardId, PINAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `setLimits` | Sets the limits for a card | `Long cardId, CardLimitsAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `changeStatus` | Changes the status of a card | `Long cardId, CardStatusAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `getCard` | Retrieves card information | `Long cardId` | `Mono<ResponseEntity<CardAdapterDTO>>` |
| `searchCards` | Searches for cards based on criteria | `SearchCardAdapterDTO` | `Mono<ResponseEntity<List<CardAdapterDTO>>>` |

### CustomerAdapter

Interface for customer operations with provider API.

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `createLegalPerson` | Creates a new legal person (business) | `LegalPersonAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `createNaturalPerson` | Creates a new natural person (individual) | `NaturalPersonAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `createTaxResidence` | Creates tax residence information | `TaxResidenceAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `requestKYC` | Requests Know Your Customer verification | `Integer userId` | `Mono<ResponseEntity<String>>` |
| `requestKYB` | Requests Know Your Business verification | `Integer userId` | `Mono<ResponseEntity<String>>` |
| `kycLiveness` | Performs a liveness check for KYC | `Integer userId, KYCLivenessAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `getUser` | Retrieves user information | `Long idUser` | `Mono<ResponseEntity<UserAdapterDTO>>` |
| `deleteUser` | Deletes a user | `Long idUser, String origin` | `Mono<ResponseEntity<String>>` |
| `editUser` | Updates user information | `Long idUser, UserAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `searchUsers` | Searches for users based on criteria | `SearchUserAdapterDTO` | `Mono<ResponseEntity<LegalPersonAdapterDTO>>` |

### DocumentAdapter

Interface for document operations with provider API.

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `createDocument` | Creates a new document | `DocumentAdapterDTO` | `Mono<ResponseEntity<String>>` |
| `getDocumentInfo` | Retrieves document information | `Long documentId` | `Mono<ResponseEntity<DocumentInfoAdapterDTO>>` |
| `deleteDocument` | Deletes a document | `Long documentId` | `Mono<ResponseEntity<String>>` |

### PayoutAdapter

Interface for payout operations with provider API.

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `createPayout` | Creates a new payout | `PayoutAdapterDTO` | `Mono<ResponseEntity<String>>` |

## 💻 Usage Example

Here's an example of how to use the BaaS Adapter interfaces with a specific implementation:

```java
@Service
public class AccountService {
    private final AccountAdapter accountAdapter;

    public AccountService(AccountAdapter accountAdapter) {
        this.accountAdapter = accountAdapter;
    }

    public Mono<String> createNewAccount(String customerId, String currency) {
        AccountAdapterDTO accountDTO = AccountAdapterDTO.builder()
            .customerId(customerId)
            .currency(currency)
            .build();

        return accountAdapter.createAccount(accountDTO)
            .map(ResponseEntity::getBody);
    }
}
```

## 🔄 Implementation

To implement a specific BaaS provider, create classes that implement these adapter interfaces. For example:

```java
@Service
public class ProviderAccountAdapter implements AccountAdapter {

    private final ProviderApiClient apiClient;

    public ProviderAccountAdapter(ProviderApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public Mono<ResponseEntity<String>> createAccount(AccountAdapterDTO accountDTO) {
        // Convert DTO to provider-specific format
        ProviderAccountRequest request = convertToProviderRequest(accountDTO);

        // Call Provider API
        return apiClient.createAccount(request)
            .map(response -> ResponseEntity.ok(response.getAccountId()));
    }

    // Other method implementations...
}
```

## 🛠️ Development

### Requirements

- Java 21
- Maven 3.8+

### Building

```bash
mvn clean install
```

### Testing

```bash
mvn test
```

## 📄 License

This project is proprietary software owned by Catalis.

## 👥 Contributing

For internal contributors, please follow the company's contribution guidelines.

## 📞 Support

For support, please contact the development team at dev@catalis.com.

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

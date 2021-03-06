/*
 * Copyright 2011 The Spring Moving Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spring.moving.core.domain.configuration.api;

import java.util.List;
import org.spring.moving.core.domain.account.api.Account;
import org.spring.moving.core.domain.account.api.CommunicationItem;

/**
 *
 * @author Kristy Schoonover
 */

public interface ServiceProvider extends CompanyProfile {
    
    
    // Relationships
    public List<Account> getAccounts();
    public void setAccounts(List<Account> accounts);
//    public List<CommunicationItem> getCommunicationItems();
//    public void setCommunicationItems(List<CommunicationItem> communicationItems);
    

}
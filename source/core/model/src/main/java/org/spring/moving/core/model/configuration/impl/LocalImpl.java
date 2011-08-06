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
package org.spring.moving.core.model.configuration.impl;

import java.io.Serializable;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.spring.moving.core.model.account.impl.CustomerImpl;

/**
 * 
 * @author Kristy Schoonover
 * @author Brad Messerle
 */
@Entity
@DiscriminatorValue("Local")
public class LocalImpl extends CompanyProfileImpl implements Serializable {

    
    @OneToMany(mappedBy="localCompanyProfile")
    private List<CustomerImpl> customers;
     
    
    
    public List<CustomerImpl> getCustomers() {
        return customers;
    }
    
    
    
    public void setCustomers(List<CustomerImpl> customers) {
        this.customers = customers;
    }
  
    
}
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

package org.spring.moving.core.model.account.impl;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.spring.moving.core.model.configuration.impl.ServiceProviderImpl;


/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "sm_account")
public class AccountImpl implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    
    //Relationships
    @OneToMany(mappedBy="account")
    private List<CustomerImpl> customers;
    
    @ManyToOne()
    private ServiceProviderImpl serviceProvider;
    
//    @OneToMany(mappedBy="")
//    private List<CommunicationItem> communicationItems;
    
    
    
    public Long getId() {
        return id;
    }
    
    
    public void setId(Long id) {
        this.id = id;
    }    
    

    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<CustomerImpl> getCustomers() {
        return customers;
    }
    
    public void setCustomers(List<CustomerImpl> customers) {
        this.customers = customers;
    }

    public ServiceProviderImpl getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProviderImpl serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
        
    public String getAddress1() {
        return address1;
    }

    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    
    public String getAddress2() {
        return address2;
    }

    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    
    public String getCity() {
        return city;
    }

    
    public void setCity(String city) {
        this.city = city;
    }

    
    public String getState() {
        return state;
    }

    
    public void setState(String state) {
        this.state = state;
    }

    
    public String getZipcode() {
        return zipcode;
    }

    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

   


}
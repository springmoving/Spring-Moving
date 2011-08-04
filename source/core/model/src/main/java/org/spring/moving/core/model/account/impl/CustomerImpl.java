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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.spring.moving.core.domain.account.api.Account;
import org.spring.moving.core.domain.account.api.Customer;
import org.spring.moving.core.domain.configuration.api.Local;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "sm_customer")
public class CustomerImpl implements Customer, Serializable {


    
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
    @ManyToOne()   
    @Column(name="localcompanyprofileid")
    private Local localCompanyProfile;
    
    @ManyToOne()
    @JoinColumn(name="accountid")
    private Account account;
    
    
    
    @Override
    public Long getId() {
        return id;
    }
    
    
    @Override
    public void setId(Long id) {
        this.id = id;
    }    
    

    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }    
    
 

    @Override
    public String getAddress1() {
        return address1;
    }

    @Override
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Override
    public String getAddress2() {
        return address2;
    }

    @Override
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getZipcode() {
        return zipcode;
    }

    @Override
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    @Override
    public Local getLocalCompanyProfile() {
        return localCompanyProfile;
    }

    @Override
    public void setLocalCompanyProfile(Local localCompanyProfile) {
        this.localCompanyProfile = localCompanyProfile;
    }
    
    
    @Override
    public Account getAccount() {
        return account;
    }

    @Override
    public void setAccount(Account account) {
        this.account = account;
    }
    
   
      
    
}
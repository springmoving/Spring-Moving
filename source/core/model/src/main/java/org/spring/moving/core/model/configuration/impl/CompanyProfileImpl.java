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
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 
 * @author Kristy Schoonover
 * @author Brad Messerle
 */
@Entity
@Table(name = "sm_company_profile")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="profile_type",
                     discriminatorType=DiscriminatorType.STRING)

public class CompanyProfileImpl implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    protected String address1;
    protected String address2;
    protected String city;
    protected String state;
    protected String zipcode;
    
    private String timeZone;
    
    
    public Long getId() {
        return id;
    }
    
    
    public String getName() {
        return name;
    }

    
    public String getTimeZone() {
        return timeZone;
    }
    
    
    public void setId(Long id) {
        this.id = id;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
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
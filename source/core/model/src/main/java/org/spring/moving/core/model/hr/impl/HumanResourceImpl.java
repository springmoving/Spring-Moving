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
package org.spring.moving.core.model.hr.impl;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Brad Messerle
 */

@Entity
@Table(name = "sm_human_resource")
public class HumanResourceImpl implements  Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    //Name 
    private String suffixName;
    private String titleName;
    private String firstName;
    private String lastName;
    private String middleName;
    private String surName;
    
    //Address
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    
    //Relationships
    private HumanResourceTypeImpl hrType;
    

    
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public String getFirstName() {
        return firstName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public String getMiddleName() {
        return middleName;
    }

    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    
    public String getSuffixName() {
        return suffixName;
    }

    
    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }

    
    public String getSurName() {
        return surName;
    }

    
    public void setSurName(String surName) {
        this.surName = surName;
    }

    
    public String getTitleName() {
        return titleName;
    }

    
    public void setTitleName(String titleName) {
        this.titleName = titleName;
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

    public HumanResourceTypeImpl getHrType() {
        return hrType;
    }

    public void setHrType(HumanResourceTypeImpl hrType) {
        this.hrType = hrType;
    }
        
    
    
    
    
    
}

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
package org.spring.moving.core.domain.hr.api;

/**
 *
 * @author Brad Messerle
 */
public interface HumanResource {
    
    
    //Idenity
    public Long getId();
    public void setId(Long id);
    
   
    //Name
    public String getFirstName();
    public void setFirstName(String firstName);
    public String getLastName();
    public void setLastName(String lastName); 
    public String getMiddleName();
    public void setMiddleName(String middleName);
    public String getSuffixName();
    public void setSuffixName(String suffixName); 
    public String getSurName();
    public void setSurName(String surName); 
    public String getTitleName();
    public void setTitleName(String titleName);
    
    //Address
    public String getAddress1();
    public void setAddress1(String address1);
    public String getAddress2();
    public void setAddress2(String address2);
    public String getCity();
    public void setCity(String city);
    public String getState(); 
    public void setState(String state);
    public String getZipcode();
    public void setZipcode(String zipcode);
    
    
}

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
package org.spring.moving.core.model.impl;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.spring.moving.core.model.api.Address;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "ADDRESSES")
public class AddressImpl implements Address, Serializable {

   private String address1;
   private String address2;
   private String city;
   private int id;
   private String state;
   private String zipCode;
   
   public String getAddress1() {
       return address1;
   }
   
   public String getAddress2() {
       return address2;
   }
   
   public String getCity() {
       return city;
   }
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public int getId() {
       return id;
   }
   
   public String getState() {
       return state;
   }
   
   public String getZipCode() {
       return zipCode;
   }
   
   public void setAddress1(String address1) {
       this.address1 = address1;
   }
   
   public void setAddress2(String address2) {
       this.address2 = address2;
   }
   
   public void setCity(String city) {
       this.city = city;
   }
   
   public void setId(int id) {
       this.id = id;
   }
   
   public void setState(String state) {
       this.state = state;
   }
   
   public void setZipCode(String zipCode) {
       this.zipCode = zipCode;
   }

}
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
import javax.persistence.OneToMany;
import javax.persistence.Id;
import java.util.List;
import org.spring.moving.core.model.api.Address;
import org.spring.moving.core.model.api.CommunicationItem;
import org.spring.moving.core.model.api.ShipperInfo;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "SHIPPER_INFOS")
public class ShipperInfoImpl implements ShipperInfo, Serializable {

   private Address address;
   private List<CommunicationItem> communicationItems;
   private String firstName;
   private int id;
   private String lastName;
   
   public Address getAddress() {
       return address;
   }
   
   @OneToMany(mappedBy="shipperInfo")
   public List<CommunicationItem> getCommunicationItems() {
      return communicationItems;
   }

   public String getFirstName() {
       return firstName;
   }
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public int getId() {
       return id;
   }
   
   public String getLastName() {
       return lastName;
   }
   
   public void setAddress(Address address) {
       this.address = address;
   }
   
   public void setCommunicationItems(List<CommunicationItem> communicationItems) {
       this.communicationItems = communicationItems;
   }
   
   public void setFirstName(String firstName) {
        this.firstName = firstName;
   }

   public void setId(int id) {
        this.id = id;
   }
   
   public void setLastName(String lastName) {
        this.lastName = lastName;
   }
    
}
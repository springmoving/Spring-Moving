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

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.spring.moving.core.model.api.Account;
import org.spring.moving.core.model.api.Address;
import org.spring.moving.core.model.api.CommunicationItem;
import org.spring.moving.core.model.api.Move;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "ACCOUNTS")
public class AccountImpl implements Account {

    private Address address;
    private List<CommunicationItem> communicationItems;
    private int id;
    private List<Move> moves;
    private String name;
    
    public Address getAddress() {
        return address;
    }
    
    @OneToMany(mapped="accounts")
    public List<CommunicationItem> getCommunicationItems() {
        return communicationItems;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    
    @OneToMany(mappedBy="accounts")
    public List<Move> getMoves() {
        return moves;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void setCommunicationItems(List<CommunicationItem> communicationItems) {
        this.communicationItems = communicationItems;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
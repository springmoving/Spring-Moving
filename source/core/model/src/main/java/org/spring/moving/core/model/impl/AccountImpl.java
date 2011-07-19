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
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.spring.moving.core.model.api.Account;
import org.spring.moving.core.model.api.CommunicationItem;
import org.spring.moving.core.model.api.Move;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "ACCOUNTS")
public class AccountImpl implements Account, Serializable {


    private int id;
    private String name;

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private List<CommunicationItem> communicationItems;
    private List<Move> moves;


    @OneToMany(mappedBy = "accounts")
    @Override
    public List<CommunicationItem> getCommunicationItems() {
        return communicationItems;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public int getId() {
        return id;
    }

    @OneToMany(mappedBy = "accounts")
    @Override
    public List<Move> getMoves() {
        return moves;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setCommunicationItems(List<CommunicationItem> communicationItems) {
        this.communicationItems = communicationItems;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setMoves(List<Move> moves) {
        this.moves = moves;
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


}
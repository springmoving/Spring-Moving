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

package org.spring.moving.core.model.api;

import java.util.List;

/**
 *
 * @author Kristy Schoonover
 */

public interface Account {
    
    public String getAddress1();
    public String getAddress2();
    public String getCity();
    public List<CommunicationItem> getCommunicationItems();
    public int getId();
    public List<Move> getMoves();
    public String getName();
    public String getState();
    public String getZipCode();
    public void setAddress1(String address1);
    public void setAddress2(String address2);
    public void setCity(String city);
    public void setCommunicationItems(List<CommunicationItem> communicationItems);
    public void setId(int id);
    public void setMoves(List<Move> moves);
    public void setName(String name);
    public void setState(String state);
    public void setZipCode(String zipCode);
}
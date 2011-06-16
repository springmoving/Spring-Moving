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
import org.spring.moving.core.model.api.Agent;
import org.spring.moving.core.model.api.VanLine;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "VAN_LINES")
public class VanLineImpl extends CompanyProfileImpl implements VanLine, Serializable {

    private List<Agent> agents;
    private int id;
    private String name;
    
    @OneToMany(mappedBy="vanLines")
    public List<Agent> getAgents() {
        return agents;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }
  
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
        
}
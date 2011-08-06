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
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.spring.moving.core.model.configuration.impl.VanLineImpl;

/**
 * 
 * @author Kristy Schoonover
 * @author Brad Messerle
 */
@Entity
@Table(name = "sm_agent")
public class AgentImpl implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    //Relationships
    
    @ManyToOne
    @JoinColumn(name="vanlineid")
    private VanLineImpl vanLine;
   
    
    public Long getId() {
        return id;
    }
    
    
    public void setId(Long id) {
        this.id = id;
    }    
    
       
    
    public String getName() {
        return name;
    }
    
    
    
    public void setName(String name) {
        this.name = name;
    }

    
    public VanLineImpl getVanLine() {
        return vanLine;
    }

    
    public void setVanLine(VanLineImpl vanLine) {
        this.vanLine = vanLine;
    }
    
    
    
}
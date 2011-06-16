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
import javax.persistence.OneToMany;
import java.util.List;
import org.spring.moving.core.model.api.CubeSheet;
import org.spring.moving.core.model.api.CubeSheetCategory;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "CUBE_SHEETS")
public class CubeSheetImpl implements CubeSheet, Serializable {

    private List<CubeSheetCategory> excludedItems;
    private String extraLabor;
    private int id;
    private List<CubeSheetCategory> includedItems;
    private String name;
    private String notes;
    
    @OneToMany(mappedBy="cubeSheet")
    public List<CubeSheetCategory> getExcludedItems() {
        return excludedItems;
    }
    
    public String getExtraLabor() {
        return extraLabor;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    
    @OneToMany(mappedBy="cubeSheet")
    public List<CubeSheetCategory> getIncludedItems() {
        return includedItems;
    }
    
    public String getName() {
        return name;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setExcludedItems(List<CubeSheetCategory> excludedItems) {
        this.excludedItems = excludedItems;
    }
    
    public void setExtraLabor(String extraLabor) {
        this.extraLabor = extraLabor;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setIncludedItems(List<CubeSheetCategory> includedItems) {
        this.includedItems = includedItems;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
}
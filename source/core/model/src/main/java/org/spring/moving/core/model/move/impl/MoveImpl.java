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
package org.spring.moving.core.model.move.impl;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Brad Messerle
 */

@Entity
@Table(name="sm_move")
public class MoveImpl implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    
    //Attributes
    private Long surveryDate;
    private String workOrderNumber;

    //Relationships
    @OneToMany (mappedBy="move")
    private List<CrateImpl> crates;
    
    @OneToMany (mappedBy="move")
    private List<CubeSheetImpl> cubeSheets;
    
    @OneToMany (mappedBy="move")
    private PackingMaterialImpl packingMaterial;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSurveryDate() {
        return surveryDate;
    }

    public void setSurveryDate(Long surveryDate) {
        this.surveryDate = surveryDate;
    }

    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    public void setWorkOrderNumber(String workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }

    public List<CrateImpl> getCrates() {
        return crates;
    }

    public void setCrates(List<CrateImpl> crates) {
        this.crates = crates;
    }

    public List<CubeSheetImpl> getCubeSheets() {
        return cubeSheets;
    }

    public void setCubeSheets(List<CubeSheetImpl> cubeSheets) {
        this.cubeSheets = cubeSheets;
    }

    public PackingMaterialImpl getPackingMaterial() {
        return packingMaterial;
    }

    public void setPackingMaterial(PackingMaterialImpl packingMaterial) {
        this.packingMaterial = packingMaterial;
    }
    
    
}

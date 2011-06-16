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
import java.util.Date;
import java.util.List;
import org.spring.moving.core.model.api.Crate;
import org.spring.moving.core.model.api.CubeSheet;
import org.spring.moving.core.model.api.Move;
import org.spring.moving.core.model.api.PackingMaterial;
import org.spring.moving.core.model.api.ShipperInfo;
import org.spring.moving.core.model.api.StorageInTransit;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "MOVES")
public class MoveImpl implements Move, Serializable {

    private List<Crate> crates;
    private List<CubeSheet> cubeSheets;
    private int id;
    private PackingMaterial packingMaterial;
    private ShipperInfo shipper;
    private StorageInTransit sit;
    private Date surveyDate;
    private int workOrderNumber;

    @OneToMany(mappedBy="moves")
    public List<Crate> getCrates() {
        return crates;
    }
    
    @OneToMany(mappedBy="moves")
    public List<CubeSheet> getCubeSheets() {
        return cubeSheets;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    
    public PackingMaterial getPackingMaterial() {
        return packingMaterial;
    }
    
    public ShipperInfo getShipper() {
        return shipper;
    }
    
    public StorageInTransit getSit() {
        return sit;
    }
    
    public Date getSurveyDate() {
        return surveyDate;
    }

    public int getWorkOrderNumber() {
        return workOrderNumber;
    }

    public void setCrates(List<Crate> crates) {
        this.crates = crates;
    }
    
    public void setCubeSheets(List<CubeSheet> cubeSheets) {
        this.cubeSheets = cubeSheets;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setPackingMaterial(PackingMaterial packingMaterial) {
        this.packingMaterial = packingMaterial;
    }
    
    public void setShipper(ShipperInfo shipper) {
        this.shipper = shipper;
    }
    
    public void setSit(StorageInTransit sit) {
        this.sit = sit;
    }
    
    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }
    
    public void setWorkOrderNumber(int workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }
    
}
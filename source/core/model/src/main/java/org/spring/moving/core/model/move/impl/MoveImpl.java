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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Brad Messerle
 */

@Entity
@Table(name="sm_move")
public class MoveImpl implements Serializable {
  
    //Idenity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    
    //Attributes
    private Long surveryDate;
    private Long packDate;
    private Long loadDate;
    private Long deliveryDate;
    private String workOrderNumber;
    private String specialInstructions;

    //Relationships
    @OneToMany (mappedBy="move")
    private List<CrateImpl> crates;
    
    @OneToMany (mappedBy="move")
    private List<CubeSheetImpl> cubeSheets;
    
    @OneToOne (mappedBy="move")
    private PackingMaterialImpl packingMaterial;
    
    @OneToMany (mappedBy="move")
    private List<ExtraPickupDeliveryImpl> extraStops;
    
    @OneToMany (mappedBy="move")
    private List<ResidenceInformationImpl> locationInformation;
    
    @OneToOne 
    private ExtraLaborImpl extraLabor;
    
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

    public List<ExtraPickupDeliveryImpl> getExtraStops() {
        return extraStops;
    }

    public void setExtraStops(List<ExtraPickupDeliveryImpl> extraStops) {
        this.extraStops = extraStops;
    }

    public Long getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Long deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Long loadDate) {
        this.loadDate = loadDate;
    }

    public Long getPackDate() {
        return packDate;
    }

    public void setPackDate(Long packDate) {
        this.packDate = packDate;
    }

    public List<ResidenceInformationImpl> getLocationInformation() {
        return locationInformation;
    }

    public void setLocationInformation(List<ResidenceInformationImpl> locationInformation) {
        this.locationInformation = locationInformation;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public ExtraLaborImpl getExtraLabor() {
        return extraLabor;
    }

    public void setExtraLabor(ExtraLaborImpl extraLabor) {
        this.extraLabor = extraLabor;
    }
    
    
    
    
}

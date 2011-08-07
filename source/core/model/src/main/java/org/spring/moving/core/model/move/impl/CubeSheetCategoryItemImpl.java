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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Brad Messerle
 */
@Entity
@Table(name="sm_move_cubesheet_items")
public class CubeSheetCategoryItemImpl implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    
    
    //Attributes
    private String name;
    private int cubicFeet;
    private int numberOfItems;
    private String applianceMake;
    private String applianceModel;
    private int numberOfCribMattress;
    private int numberOfSingleMattress;
    
    
    //Relationships
    @ManyToOne
    private CubeSheetImpl cubeSheet;

    
    
    
    public String getApplianceMake() {
        return applianceMake;
    }

    public void setApplianceMake(String applianceMake) {
        this.applianceMake = applianceMake;
    }

    public String getApplianceModel() {
        return applianceModel;
    }

    public void setApplianceModel(String applianceModel) {
        this.applianceModel = applianceModel;
    }

    public CubeSheetImpl getCubeSheet() {
        return cubeSheet;
    }

    public void setCubeSheet(CubeSheetImpl cubeSheet) {
        this.cubeSheet = cubeSheet;
    }

    public int getCubicFeet() {
        return cubicFeet;
    }

    public void setCubicFeet(int cubicFeet) {
        this.cubicFeet = cubicFeet;
    }

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

    public int getNumberOfCribMattress() {
        return numberOfCribMattress;
    }

    public void setNumberOfCribMattress(int numberOfCribMattress) {
        this.numberOfCribMattress = numberOfCribMattress;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public int getNumberOfSingleMattress() {
        return numberOfSingleMattress;
    }

    public void setNumberOfSingleMattress(int numberOfSingleMattress) {
        this.numberOfSingleMattress = numberOfSingleMattress;
    }
    
    
    
    
    
    
}

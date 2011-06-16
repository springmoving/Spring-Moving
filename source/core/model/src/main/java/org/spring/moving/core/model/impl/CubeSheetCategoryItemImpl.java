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
import org.spring.moving.core.model.api.CubeSheetCategoryItem;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "CUBE_SHEET_CATEGORY_ITEMS")
public class CubeSheetCategoryItemImpl implements CubeSheetCategoryItem , Serializable {

    private String applianceMake;
    private String applianceModel;
    private int cubicFeet;
    private int customHeight;
    private int customLength;
    private int customWidth;
    private int id;
    private String name;
    private int numberOfCribMattress;
    private int numberOfItems;
    private int numberOfSingleMattress;
    private int weight;
    
    public String getApplianceMake() {
        return applianceMake;
    }
    
    public String getApplianceModel() {
        return applianceModel;
    }
    
    public int getCubicFeet() {
        return cubicFeet;
    }
    
    public int getCustomHeight() {
        return customHeight;
    }
    
    public int getCustomLength() {
        return customLength;
    }
    
    public int getCustomWidth() {
        return customWidth;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumberOfCribMattress() {
        return numberOfCribMattress;
    }
    
    public int getNumberOfItems() {
        return numberOfItems;
    }
    
    public int getNumberOfSingleMattress() {
        return numberOfSingleMattress;
    }
    
    public int getWeight() {
        return weight;
    }

    public void setApplianceMake(String applianceMake) {
        this.applianceMake = applianceMake;
    }
    
    public void setApplianceModel(String applianceModel) {
        this.applianceModel = applianceModel;
    }
    
    public void setCubicFeet(int cubicFeet) {
        this.cubicFeet = cubicFeet;
    }
    
    public void setCustomHeight(int customHeight) {
        this.customHeight = customHeight;
    }
    
    public void setCustomLength(int customLength) {
        this.customLength = customLength;
    }
    
    public void setCustomWidth(int customWidth) {
        this.customWidth = customWidth;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setNumberOfCribMattress(int numberOfCribMattress) {
        this.numberOfCribMattress = numberOfCribMattress;
    }
    
    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
    
    public void setNumberOfSingleMattress(int numberOfSingleMattress) {
        this.numberOfSingleMattress = numberOfSingleMattress;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }

}

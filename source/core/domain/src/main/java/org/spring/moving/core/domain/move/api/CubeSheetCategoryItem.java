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

package org.spring.moving.core.domain.move.api;

/**
 *
 * @author Kristy Schoonover
 */

public interface CubeSheetCategoryItem {
    
    public String getApplianceMake();
    public String getApplianceModel();
    public int getCubicFeet();
    public int getCustomHeight();
    public int getCustomLength();
    public int getCustomWidth();
    public int getId();
    public String getName();
    public int getNumberOfCribMattress();
    public int getNumberOfItems();
    public int getNumberOfSingleMattress();
    public int getWeight();
    public void setApplianceMake(String applianceMake);
    public void setApplianceModel(String applianceModel);
    public void setCubicFeet(int cubicFeet);
    public void setCustomHeight(int customHeight);
    public void setCustomLength(int customLength);
    public void setCustomWidth(int customWidth);
    public void setId(int id);
    public void setName(String name);
    public void setNumberOfCribMattress(int numberOfCribMattress);
    public void setNumberOfItems(int numberOfItems);
    public void setNumberOfSingleMattress(int numberOfSingleMattress);
    public void setWeight(int weight);

}
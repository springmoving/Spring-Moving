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

import java.util.Date;
import java.util.List;

/**
 *
 * @author Kristy Schoonover
 */

public interface Move {
    
    public List<Crate> getCrates();
    public List<CubeSheet> getCubeSheets();
    public int getId();
    public PackingMaterial getPackingMaterial();
    public ShipperInfo getShipper();
    public StorageInTransit getSit();
    public Date getSurveyDate();
    public int getWorkOrderNumber();
    public void setCrates(List<Crate> crates);
    public void setCubeSheets(List<CubeSheet> cubeSheets);
    public void setId(int id);
    public void setPackingMaterial(PackingMaterial packingMaterial);
    public void setShipper(ShipperInfo shipper);
    public void setSit(StorageInTransit sit);
    public void setSurveyDate(Date surveyDate);
    public void setWorkOrderNumber(int workOrderNumber);   
    
}

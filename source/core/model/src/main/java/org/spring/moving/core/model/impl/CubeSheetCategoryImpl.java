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
import org.spring.moving.core.model.api.CubeSheetCategory;
import org.spring.moving.core.model.api.CubeSheetCategoryItem;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "CUBE_SHEET_CATEGORIES")
public class CubeSheetCategoryImpl implements CubeSheetCategory, Serializable {

    private int id;
    private List<CubeSheetCategoryItem> items;
    private String name;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public int getId() {
        return id;
    }
    
    @OneToMany(mappedBy="cubeSheetCategories")
    @Override
    public List<CubeSheetCategoryItem> getItems() {
      return items;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public void setItems(List<CubeSheetCategoryItem> items) {
    this.items = items;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
}
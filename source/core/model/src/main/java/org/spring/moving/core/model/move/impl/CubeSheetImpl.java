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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Brad Messerle
 */
@Entity
@Table(name="sm_move_cubesheets")
public class CubeSheetImpl implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    
    //Attributes
    private String extraLabor;
    private String description;
   
    
    //Relationships
    @ManyToOne
    @JoinColumn(name="move_id")
    private MoveImpl move;
    
    @OneToMany(mappedBy="cubeSheet")
    private List<CubeSheetCategoryItemImpl> items;
    

        
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtraLabor() {
        return extraLabor;
    }

    public void setExtraLabor(String extraLabor) {
        this.extraLabor = extraLabor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CubeSheetCategoryItemImpl> getItems() {
        return items;
    }

    public void setItems(List<CubeSheetCategoryItemImpl> items) {
        this.items = items;
    }

    public MoveImpl getMove() {
        return move;
    }

    public void setMove(MoveImpl move) {
        this.move = move;
    }

    
}

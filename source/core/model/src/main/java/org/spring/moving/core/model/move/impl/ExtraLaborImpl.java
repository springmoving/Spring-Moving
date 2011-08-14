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
import javax.persistence.Column;
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
@Table(name="sm_move_extra_labor")
public class ExtraLaborImpl implements Serializable {
    
    //Identiy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    
    //Attributes
    private int pboNumberOfMen;
    private int pboNumberOfHours;
    private int bedAssemblyNumberOfMen;
    private int bedAssemblyNumberOfHours;
    private int desksNumberOfMen;
    private int desksNumberOfHours;
    private int atticRemovalNumberOfMen;
    private int atticRemovalNumberOfHours;
    private String other;
    
    //Relatinships
    @ManyToOne
    @Column(name="move_id")
    private MoveImpl move;
    
    public int getAtticRemovalNumberOfHours() {
        return atticRemovalNumberOfHours;
    }

    public void setAtticRemovalNumberOfHours(int atticRemovalNumberOfHours) {
        this.atticRemovalNumberOfHours = atticRemovalNumberOfHours;
    }

    public int getAtticRemovalNumberOfMen() {
        return atticRemovalNumberOfMen;
    }

    public void setAtticRemovalNumberOfMen(int atticRemovalNumberOfMen) {
        this.atticRemovalNumberOfMen = atticRemovalNumberOfMen;
    }

    public int getBedAssemblyNumberOfHours() {
        return bedAssemblyNumberOfHours;
    }

    public void setBedAssemblyNumberOfHours(int bedAssemblyNumberOfHours) {
        this.bedAssemblyNumberOfHours = bedAssemblyNumberOfHours;
    }

    public int getBedAssemblyNumberOfMen() {
        return bedAssemblyNumberOfMen;
    }

    public void setBedAssemblyNumberOfMen(int bedAssemblyNumberOfMen) {
        this.bedAssemblyNumberOfMen = bedAssemblyNumberOfMen;
    }

    public int getDesksNumberOfHours() {
        return desksNumberOfHours;
    }

    public void setDesksNumberOfHours(int desksNumberOfHours) {
        this.desksNumberOfHours = desksNumberOfHours;
    }

    public int getDesksNumberOfMen() {
        return desksNumberOfMen;
    }

    public void setDesksNumberOfMen(int desksNumberOfMen) {
        this.desksNumberOfMen = desksNumberOfMen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public int getPboNumberOfHours() {
        return pboNumberOfHours;
    }

    public void setPboNumberOfHours(int pboNumberOfHours) {
        this.pboNumberOfHours = pboNumberOfHours;
    }

    public int getPboNumberOfMen() {
        return pboNumberOfMen;
    }

    public void setPboNumberOfMen(int pboNumberOfMen) {
        this.pboNumberOfMen = pboNumberOfMen;
    }
    
    
    
}

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Brad Messerle
 */
@Entity
@Table(name="sm_move_packing_material")
public class PackingMaterialImpl implements Serializable {
    
    
    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    
    //Attributes
    private int numberOfDispacksCp;
    private int numberOfDispacksPbo;
    private int numberOfCarton15Cp;
    private int numberOfCarton15Pbo;
    private int numberOfCarton30Cp;
    private int numberOfCarton30Pbo;
    private int numberOfCarton45Cp;
    private int numberOfCarton45Pbo;
    private int numberOfCarton60Cp;
    private int numberOfCarton60Pbo;
    private int numberOfWardrobeCp;
    private int numberofWardrobePbo;
    private int numberOfMirrorCartonCp;
    private int numberOfMirrorCartonPbo;
    
    //Relationships
    @ManyToOne()
    @JoinColumn(name="move_id")
    private MoveImpl move;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoveImpl getMove() {
        return move;
    }

    public void setMove(MoveImpl move) {
        this.move = move;
    }

    public int getNumberOfCarton15Cp() {
        return numberOfCarton15Cp;
    }

    public void setNumberOfCarton15Cp(int numberOfCarton15Cp) {
        this.numberOfCarton15Cp = numberOfCarton15Cp;
    }

    public int getNumberOfCarton15Pbo() {
        return numberOfCarton15Pbo;
    }

    public void setNumberOfCarton15Pbo(int numberOfCarton15Pbo) {
        this.numberOfCarton15Pbo = numberOfCarton15Pbo;
    }

    public int getNumberOfCarton30Cp() {
        return numberOfCarton30Cp;
    }

    public void setNumberOfCarton30Cp(int numberOfCarton30Cp) {
        this.numberOfCarton30Cp = numberOfCarton30Cp;
    }

    public int getNumberOfCarton30Pbo() {
        return numberOfCarton30Pbo;
    }

    public void setNumberOfCarton30Pbo(int numberOfCarton30Pbo) {
        this.numberOfCarton30Pbo = numberOfCarton30Pbo;
    }

    public int getNumberOfCarton45Cp() {
        return numberOfCarton45Cp;
    }

    public void setNumberOfCarton45Cp(int numberOfCarton45Cp) {
        this.numberOfCarton45Cp = numberOfCarton45Cp;
    }

    public int getNumberOfCarton45Pbo() {
        return numberOfCarton45Pbo;
    }

    public void setNumberOfCarton45Pbo(int numberOfCarton45Pbo) {
        this.numberOfCarton45Pbo = numberOfCarton45Pbo;
    }

    public int getNumberOfCarton60Cp() {
        return numberOfCarton60Cp;
    }

    public void setNumberOfCarton60Cp(int numberOfCarton60Cp) {
        this.numberOfCarton60Cp = numberOfCarton60Cp;
    }

    public int getNumberOfCarton60Pbo() {
        return numberOfCarton60Pbo;
    }

    public void setNumberOfCarton60Pbo(int numberOfCarton60Pbo) {
        this.numberOfCarton60Pbo = numberOfCarton60Pbo;
    }

    public int getNumberOfDispacksCp() {
        return numberOfDispacksCp;
    }

    public void setNumberOfDispacksCp(int numberOfDispacksCp) {
        this.numberOfDispacksCp = numberOfDispacksCp;
    }

    public int getNumberOfDispacksPbo() {
        return numberOfDispacksPbo;
    }

    public void setNumberOfDispacksPbo(int numberOfDispacksPbo) {
        this.numberOfDispacksPbo = numberOfDispacksPbo;
    }

    public int getNumberOfMirrorCartonCp() {
        return numberOfMirrorCartonCp;
    }

    public void setNumberOfMirrorCartonCp(int numberOfMirrorCartonCp) {
        this.numberOfMirrorCartonCp = numberOfMirrorCartonCp;
    }

    public int getNumberOfMirrorCartonPbo() {
        return numberOfMirrorCartonPbo;
    }

    public void setNumberOfMirrorCartonPbo(int numberOfMirrorCartonPbo) {
        this.numberOfMirrorCartonPbo = numberOfMirrorCartonPbo;
    }

    public int getNumberOfWardrobeCp() {
        return numberOfWardrobeCp;
    }

    public void setNumberOfWardrobeCp(int numberOfWardrobeCp) {
        this.numberOfWardrobeCp = numberOfWardrobeCp;
    }

    public int getNumberofWardrobePbo() {
        return numberofWardrobePbo;
    }

    public void setNumberofWardrobePbo(int numberofWardrobePbo) {
        this.numberofWardrobePbo = numberofWardrobePbo;
    }
    
       
    
}

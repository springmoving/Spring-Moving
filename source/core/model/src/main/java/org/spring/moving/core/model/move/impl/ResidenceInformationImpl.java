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
@Table(name="sm_move_residence_info")
public class ResidenceInformationImpl implements Serializable {
    
    public static enum ResidenceLocation { ORIGIN, DESTINATION }
    public static enum ResidenceType { SINGLE_FAMILY, APARTMENT_WALKUP, APARTMENT_ELEVATOR }
    
    
    //Identiy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    
    //Attributes
    private String type;
    private String location;
    private int numberOfInsideSteps;
    private int numberOfOutsideSteps;
    private Boolean elevator;
    private Boolean longCarry;
    private String longCarryDistance;
    private Boolean shuttleRequired;
    private String shuttleTruckSize;
    private String shuttleReason;
    private Boolean basement;
    private Boolean extraFloorProtection;
    private Boolean streetAccess;
    private Boolean parkingAvailability;
    private Boolean lowTrees;
    private Boolean numberOfBedrooms;
    private Boolean numberOfLevels;
    private String notes;
    
    
    //Relationships
    @ManyToOne
    @Column(name="move_id")
    private MoveImpl move;

    
    
    
    
    public Boolean getBasement() {
        return basement;
    }

    public void setBasement(Boolean basement) {
        this.basement = basement;
    }

    public Boolean getElevator() {
        return elevator;
    }

    public void setElevator(Boolean elevator) {
        this.elevator = elevator;
    }

    public Boolean getExtraFloorProtection() {
        return extraFloorProtection;
    }

    public void setExtraFloorProtection(Boolean extraFloorProtection) {
        this.extraFloorProtection = extraFloorProtection;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getLowTrees() {
        return lowTrees;
    }

    public void setLowTrees(Boolean lowTrees) {
        this.lowTrees = lowTrees;
    }

    public MoveImpl getMove() {
        return move;
    }

    public void setMove(MoveImpl move) {
        this.move = move;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(Boolean numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfInsideSteps() {
        return numberOfInsideSteps;
    }

    public void setNumberOfInsideSteps(int numberOfInsideSteps) {
        this.numberOfInsideSteps = numberOfInsideSteps;
    }

    public Boolean getNumberOfLevels() {
        return numberOfLevels;
    }

    public void setNumberOfLevels(Boolean numberOfLevels) {
        this.numberOfLevels = numberOfLevels;
    }

    public int getNumberOfOutsideSteps() {
        return numberOfOutsideSteps;
    }

    public void setNumberOfOutsideSteps(int numberOfOutsideSteps) {
        this.numberOfOutsideSteps = numberOfOutsideSteps;
    }

    public Boolean getParkingAvailability() {
        return parkingAvailability;
    }

    public void setParkingAvailability(Boolean parkingAvailability) {
        this.parkingAvailability = parkingAvailability;
    }

    public String getShuttleReason() {
        return shuttleReason;
    }

    public void setShuttleReason(String shuttleReason) {
        this.shuttleReason = shuttleReason;
    }

    public Boolean getShuttleRequired() {
        return shuttleRequired;
    }

    public void setShuttleRequired(Boolean shuttleRequired) {
        this.shuttleRequired = shuttleRequired;
    }

    public String getShuttleTruckSize() {
        return shuttleTruckSize;
    }

    public void setShuttleTruckSize(String shuttleTruckSize) {
        this.shuttleTruckSize = shuttleTruckSize;
    }

    public Boolean getStreetAccess() {
        return streetAccess;
    }

    public void setStreetAccess(Boolean streetAccess) {
        this.streetAccess = streetAccess;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getLongCarry() {
        return longCarry;
    }

    public void setLongCarry(Boolean longCarry) {
        this.longCarry = longCarry;
    }

    public String getLongCarryDistance() {
        return longCarryDistance;
    }

    public void setLongCarryDistance(String longCarryDistance) {
        this.longCarryDistance = longCarryDistance;
    }
    
}

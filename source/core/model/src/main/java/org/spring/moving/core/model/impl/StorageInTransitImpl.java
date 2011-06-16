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
import org.spring.moving.core.model.api.StorageInTransit;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "STORAGE_IN_TRANSIT")
public class StorageInTransitImpl implements StorageInTransit, Serializable {

   private boolean atDestination;
   private boolean atOrigin;
   private int id;
   private int numberOfDays;
   
   public boolean getAtDestination() {
       return atDestination;
   }
   
   public boolean getAtOrigin() {
       return atOrigin;
   }
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public int getId() {
       return id;
   }
   
   
   public int getNumberOfDays() {
       return numberOfDays;
   }
   
   public void setAtDestination(boolean atDestination) {
       this.atDestination = atDestination;
   }
   
   public void setAtOrigin(boolean atOrigin) {
       this.atOrigin = atOrigin;
   }
   
   public void setId(int id) {
       this.id = id;
   }
   
   public void setNumberOfDays(int numberOfDays) {
       this.numberOfDays = numberOfDays;
   }

}
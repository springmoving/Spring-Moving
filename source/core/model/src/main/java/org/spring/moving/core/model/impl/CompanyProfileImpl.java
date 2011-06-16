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
import org.spring.moving.core.model.api.CompanyProfile;

/**
 * 
 * @author Kristy Schoonover
 */
@Entity
@Table(name = "COMPANY_PROFILES")
public class CompanyProfileImpl implements CompanyProfile, Serializable {

    private int id;
    private String name;
    private String timeZone;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTimeZone() {
        return timeZone;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    
}
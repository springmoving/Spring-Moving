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

import java.util.List;

/**
 *
 * @author Kristy Schoonover
 * @author Brad Messerle
 */

public interface CubeSheet {
    
    public List<CubeSheetCategory> getExcludedItems();
    public String getExtraLabor();
    public Long getId();
    public List<CubeSheetCategory> getIncludedItems();
    public String getName();
    public String getNotes();
    public void setExcludedItems(List<CubeSheetCategory> excludedItems);
    public void setExtraLabor(String extraLabor);
    public void setId(Long id);
    public void setIncludedItems(List<CubeSheetCategory> includedItems);
    public void setName(String name);
    public void setNotes(String notes);
    
}

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
 */

public interface CubeSheetCategory {
    
    public int getId();
    public List<CubeSheetCategoryItem> getItems();
    public String getName();
    public void setId(int id);
    public void setItems(List<CubeSheetCategoryItem> items);
    public void setName(String name);
    
}

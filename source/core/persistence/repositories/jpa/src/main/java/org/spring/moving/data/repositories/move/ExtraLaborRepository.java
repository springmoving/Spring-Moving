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
package org.spring.moving.data.repositories.move;

import org.spring.moving.core.model.move.impl.ExtraLaborImpl;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Brad Messerle
 */
public interface ExtraLaborRepository extends CrudRepository<ExtraLaborImpl, Long> {
    
}

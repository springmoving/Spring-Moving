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
package org.spring.moving.core.model.move.status.impl;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Move Status of Delivering
 *
 * @author Brad Messerle
 */
@Entity
@DiscriminatorValue("Delivering")
public class MoveStatusDeliveringImpl extends MoveStatusImpl implements Serializable {

    /**
     * Return the status type of delivering
     * @return Status.DELIVERING
     */
    public final Status getStatus() {
        return Status.DELIVERING;
    }
}

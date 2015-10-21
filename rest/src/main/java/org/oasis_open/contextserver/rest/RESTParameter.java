package org.oasis_open.contextserver.rest;

/*
 * #%L
 * context-server-rest
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2014 - 2015 Jahia Solutions
 * %%
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
 * #L%
 */

import org.oasis_open.contextserver.api.conditions.initializers.ChoiceListValue;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of a {@link org.oasis_open.contextserver.api.Parameter} better suited for definitions.
 */
public class RESTParameter {
    private String id;
    private String type;
    private boolean multivalued = false;
    private String defaultValue = null;
    private List<ChoiceListValue> choiceListValues = new ArrayList<ChoiceListValue>();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMultivalued() {
        return multivalued;
    }

    public void setMultivalued(boolean multivalued) {
        this.multivalued = multivalued;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public List<ChoiceListValue> getChoiceListValues() {
        return choiceListValues;
    }

    public void setChoiceListValues(List<ChoiceListValue> choiceListValues) {
        this.choiceListValues = choiceListValues;
    }
}

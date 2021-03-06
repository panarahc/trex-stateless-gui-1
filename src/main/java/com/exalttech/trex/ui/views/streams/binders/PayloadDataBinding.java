/**
 * *****************************************************************************
 * Copyright (c) 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************
 */
/*



 */
package com.exalttech.trex.ui.views.streams.binders;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PayloadDataBinding extends AbstractStreamDataBinding {
    private StringProperty typeProperty = new SimpleStringProperty();
    private StringProperty patternProperty = new SimpleStringProperty();

    public PayloadDataBinding() {
        setInitialValues();
    }

    @JsonIgnore
    public StringProperty getTypeProperty() {
        return typeProperty;
    }

    @JsonIgnore
    public StringProperty getPatternProperty() {
        return patternProperty;
    }

    @JsonProperty("type")
    public String getType() {
        return typeProperty.get();
    }

    @JsonProperty("type")
    public void setType(final String type) {
        typeProperty.set(type);
    }

    @JsonProperty("pattern")
    public String getPattern() {
        return patternProperty.get();
    }

    @JsonProperty("pattern")
    public void setPattern(final String pattern) {
        patternProperty.set(pattern);
    }

    @Override
    protected void setInitialValues() {
        typeProperty.set("Fixed Word");
        patternProperty.set("00");
    }
}

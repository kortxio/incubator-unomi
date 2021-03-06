/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.unomi.shell.commands;

import org.apache.karaf.shell.commands.Argument;
import org.apache.karaf.shell.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;
import org.apache.unomi.api.actions.ActionType;
import org.apache.unomi.api.services.DefinitionsService;
import org.apache.unomi.persistence.spi.CustomObjectMapper;

@Command(scope = "action", name = "view", description = "This will display a single action deployed in the Apache Unomi Context Server")
public class ActionViewCommand extends OsgiCommandSupport {

    private DefinitionsService definitionsService;

    @Argument(index = 0, name = "actionId", description = "The identifier for the action", required = true, multiValued = false)
    String actionTypeIdentifier;


    public void setDefinitionsService(DefinitionsService definitionsService) {
        this.definitionsService = definitionsService;
    }

    @Override
    protected Object doExecute() throws Exception {
        ActionType actionType = definitionsService.getActionType(actionTypeIdentifier);
        if (actionType == null) {
            System.out.println("Couldn't find an action with id=" + actionTypeIdentifier);
            return null;
        }
        String jsonRule = CustomObjectMapper.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(actionType);
        System.out.println(jsonRule);
        return null;
    }
}

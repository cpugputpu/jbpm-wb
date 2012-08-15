/*
 * Copyright 2012 JBoss by Red Hat.
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
package org.jbpm.console.ng.server.editors.jbpm.inbox;

import java.util.ArrayList;
import java.util.List;
import org.jbpm.task.I18NText;

/**
 *

 */
public class TaskI18NHelper {
    public static List<I18NText> adaptI18NList(List<String> list){
        List<I18NText> result = new ArrayList<I18NText>(list.size());
        for(String s : list){
            // FIX
            result.add(new I18NText("en-UK", s));
        }
        return result;
    }

    static List<String> adaptStringList(List<I18NText> descriptions) {
        List<String> result = new ArrayList<String>(descriptions.size());
        for(I18NText t : descriptions){
            // FIX
            result.add(t.getText());
        }
        return result;
    }
}

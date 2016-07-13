/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wrmsr.hifig.mergeable;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public abstract class StringMapMergeableConfig<N extends StringMapMergeableConfig<N>>
    extends MapMergeableConfig<N, String, String>
{
    public StringMapMergeableConfig()
    {
        super();
    }

    public StringMapMergeableConfig(Map<String, String> entries)
    {
        super(entries);
    }

    @JsonValue
    public Map<String, String> getEntries()
    {
        return entries;
    }
}

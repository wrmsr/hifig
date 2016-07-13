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

import java.util.List;

public abstract class IncludeMergeableConfig<N extends IncludeMergeableConfig<N>>
    extends StringListMergeableConfig<N>
{
    /*
    @JsonCreator
    public static IncludeMergeableConfigNode valueOf(Object object)
    {
        return new IncludeMergeableConfigNode(unpack(object, String.class));
    }
    */

    public IncludeMergeableConfig(List<String> items)
    {
        super(items);
    }
}

/**
 * Copyright (C) 2016 Hadrien Kohl (hadrien.kohl@gmail.com) and contributors
 *
 *     JsonStatModule.java
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package no.ssb.jsonstat;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonStatModule extends SimpleModule {

    private final String NAME = "JsonStatModule";

    @Override
    public void setupModule(SetupContext context) {
        super.setupModule(context);

        context.addDeserializers(new JsonStatDeserializer());
        // TODO: Ensure Optional can be handled.
        // TODO: Ensure Instant can be handled.

    }

    @Override
    public String getModuleName() {
        return NAME;
    }

    @Override
    public Version version() {
        return Version.unknownVersion();
    }
}

/*
 * Copyright 2021 Robin Mercier
 *
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

package com.github.azzerial.slash;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.internal.utils.Checks;

public final class SlashClientBuilder {

    private final JDA jda;

    /* Constructors */

    private SlashClientBuilder(JDA jda) {
        this.jda = jda;
    }

    /* Methods */

    public static SlashClientBuilder create(JDA jda) {
        Checks.notNull(jda, "JDA");
        return new SlashClientBuilder(jda);
    }

    public SlashClient build() {
        return new SlashClient(jda);
    }
}

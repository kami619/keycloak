/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
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

package org.keycloak.models.sessions.infinispan.remotestore;

import org.keycloak.models.sessions.infinispan.initializer.SessionLoader;

/**
 *
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
public class RemoteCacheSessionsLoaderContext extends SessionLoader.LoaderContext {

    private final int sessionsPerSegment;

    public RemoteCacheSessionsLoaderContext(int sessionsPerSegment) {
        super(1);
        this.sessionsPerSegment = sessionsPerSegment;
    }


    public int getSessionsPerSegment() {
        return sessionsPerSegment;
    }

    @Override
    public String toString() {
        return new StringBuilder("RemoteCacheSessionsLoaderContext [ ")
                .append("segmentsCount: ").append(getSegmentsCount())
                .append(", sessionsPerSegment: ").append(sessionsPerSegment)
                .append(" ]")
                .toString();
    }
}

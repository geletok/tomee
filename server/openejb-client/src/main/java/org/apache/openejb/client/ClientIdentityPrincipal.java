/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.openejb.client;

import java.io.Serializable;
import java.security.Principal;

public class ClientIdentityPrincipal implements Principal, Serializable {

    private static final long serialVersionUID = -4620883427203231384L;
    private final String name;
    private final Object clientIdentity;

    public ClientIdentityPrincipal(final String name, final Object clientIdentity) {
        this.name = name;
        this.clientIdentity = clientIdentity;
    }

    @Override
    public String getName() {
        return name;
    }

    public Object getClientIdentity() {
        return clientIdentity;
    }
}

/*
 * Copyright (c) 2008-2020, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.sql.impl.state;

/**
 * Callback to perform various actions on the query state.
 */
public interface QueryStateCallback {
    /**
     * Notify the query that fragment execution has finished.
     */
    void onFragmentFinished();

    /**
     * Cancel the query with error.
     *
     * @param e error that caused the cancel, or {@code null} if cancellation is trigerred by the user request
     */
    void cancel(Exception e);

    /**
     * Check whether the query is cancelled. If the query is not cancelled, the method returns with no side effects.
     * Otherwise an exception is thrown.
     */
    void checkCancelled();
}

/*
 * Copyright 2012 360buy, Inc.
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

package com.jd.open.sdk.android;

/**
 * JingDong Exception封装
 */
public class JdException extends Throwable {

    private int mErrorCode = 0;

    public JdException(String message) {
        super(message);
    }

    public JdException(String message, int code) {
        super(message);
        mErrorCode = code;
    }

    public int getErrorCode() {
        return mErrorCode;
    }
}

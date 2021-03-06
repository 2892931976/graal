/*
 * Copyright (c) 2015, 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.svm.core.posix.headers;

import org.graalvm.nativeimage.Platforms;
import org.graalvm.nativeimage.Platform.DARWIN_AND_JNI;
import org.graalvm.nativeimage.Platform.LINUX_AND_JNI;
import org.graalvm.nativeimage.c.CContext;
import org.graalvm.nativeimage.c.function.CFunction;

//Allow methods with non-standard names: Checkstyle: stop

/*
 * The definitions I need, manually translated from the C header file <sched.h>.
 */

@Platforms({DARWIN_AND_JNI.class, LINUX_AND_JNI.class})
@CContext(PosixDirectives.class)
public class Sched {

    /**
     * sched_yield() causes the calling thread to relinquish the CPU. The thread is moved to the end
     * of the queue for its static priority and a new thread gets to run.
     */
    @CFunction
    public static native int sched_yield();

}

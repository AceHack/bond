// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package org.bondlib;

/**
 * An implementation of the {@link Something} construct that wraps a primitive boolean value which can be
 * accessed directly and is never set to null.
 *
 * Used for values of non-nullable "bool" fields with "nothing" as the default value.
 */
public final class SomethingBoolean extends Something<Boolean> {

    /**
     * The wrapped primitive value.
     */
    public boolean value;

    // restrict instantiation to this package only
    SomethingBoolean(boolean value) {
        this.value = value;
    }

    @Override
    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return this.value ? 1 : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SomethingBoolean) {
            return this.value == ((SomethingBoolean) obj).value;
        }
        return false;
    }
}

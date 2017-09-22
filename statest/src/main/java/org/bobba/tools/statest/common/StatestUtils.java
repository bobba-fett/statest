package org.bobba.tools.statest.common;

import static org.apache.commons.lang3.Validate.notNull;

public final class StatestUtils {

    private StatestUtils() {
    }

    public static String defaultObjectId(Class<?> aClass) {
        notNull(aClass, "Cannot determine default object id for empty class");
        return aClass.getName();
    }

}

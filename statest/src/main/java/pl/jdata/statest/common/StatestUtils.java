package pl.jdata.statest.common;

import static org.apache.commons.lang3.Validate.notNull;

public final class StatestUtils {

    private StatestUtils() {
    }

    public static String defaultObjectId(Class<?> clazz) {
        notNull(clazz, "Cannot determine default object id for empty class");
        return clazz.getName();
    }

}

package info.yannxia.java.utils;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.util.Arrays;

/**
 * Created by yann on 15/10/19.
 */
public class Utils4Bean {
    private final Logger logger = LoggerContext.getContext().getLogger(Utils4Bean.class.getName());

    /**
     * most of time. if pass one param to it, will more quick
     * @param o object
     * @return true is null, false is not null
     */
    public static boolean isNotNull(Object o) {
        return o == null;
    }

    public static boolean isNotNull(Object o, Object... os) {
        return !Arrays.asList(o, os).stream().anyMatch((i) -> i == null);
    }
}

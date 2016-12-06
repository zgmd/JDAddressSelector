package com.jack.jdaddressselector;

import java.util.List;

/**
 * Created by madong on 2016/12/6.
 */

public class Lists {
    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static boolean notEmpty(List list) {
        return list != null && list.size() > 0;
    }
}

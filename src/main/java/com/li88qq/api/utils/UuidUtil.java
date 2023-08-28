package com.li88qq.api.utils;

import java.util.UUID;

/**
 * uuid工具类
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:24
 */
public class UuidUtil {

    /**
     * 获取8位uuid
     *
     * @return 8位uuid
     */
    public static String uuid8() {
        return uuid(8);
    }

    /**
     * 获取8位uuid
     *
     * @return 8位uuid
     */
    public static String uuid() {
        return uuid(null);
    }

    /**
     * 获取uuid
     *
     * @param size 位数
     * @return uuid
     */
    public static String uuid(Integer size) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        if (size != null && size > 0 && size <= 32) {
            return uuid.substring(0, size);
        }
        return uuid;
    }
}

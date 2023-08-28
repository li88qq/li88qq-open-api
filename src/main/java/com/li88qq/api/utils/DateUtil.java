package com.li88qq.api.utils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * 时间工具类
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:14
 */
public class DateUtil {

    /**
     * 获取时间戳
     *
     * @return 时间戳
     */
    public static long getTimestamp() {
        return LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
    }
}

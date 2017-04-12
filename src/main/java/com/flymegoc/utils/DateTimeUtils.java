package com.flymegoc.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by flymegoc on 2017/4/11.
 */
public class DateTimeUtils {
    private final static String formatTimeStr="yyyy-MM-ss HH:mm:ss";
    public static String format_yyyyMMddHHmmss(Date date) {
        return new SimpleDateFormat(formatTimeStr, Locale.getDefault()).format(date);
    }
}

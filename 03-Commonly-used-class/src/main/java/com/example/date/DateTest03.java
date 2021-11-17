package com.example.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {

        Date time = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s = sdf.format(time);
        System.out.println(s);

        // 获取昨天的时间
        Date endTime = new Date(System.currentTimeMillis() - 24*60*60*1000);
        SimpleDateFormat sdfEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String sEnd = sdfEnd.format(endTime);
        System.out.println(sEnd);

    }
}

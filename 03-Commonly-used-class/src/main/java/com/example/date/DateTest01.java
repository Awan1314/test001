package com.example.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * java中对日期的处理
 *  这个案例最主要掌握;
 *      知识点1:怎么获取系统当前时间
 *      知识点2: String ---> Date   format方法
 *      知识点3 : Date ---> String  parse方法
 */
public class DateTest01 {
    public static void main(String[] args) throws ParseException {

        // 获取系统当前时间
        Date date = new Date();
        System.out.println(date);

        // 将日期类型 Date，按照指定的格式进行转换: Date --转换成具有一定格式的日期字符串-->String
        // SimpleDateFormat 专门负责日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTime = sdf.format(date);
        System.out.println(nowTime);

        // 将String类型字符串  转换为日期格式
        String time = "2021-11-11 11:11:11 111";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);

    }
}

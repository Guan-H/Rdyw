package com.gzcss.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_And_LocalDateTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        method1(localDateTime);
        //method2();

    }
    private static void method2() {
        //public static LocalDateTime parse (准备解析的字符串, 解析格式) 把一个日期字符串解析成为一个LocalDateTime对象
        String s = "2020年11月12日 13:14:15";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, pattern);
        System.out.println(parse);
    }

    private static void method1(LocalDateTime localDateTime) {
        System.out.println(localDateTime);
        //public String format (指定格式)   把一个LocalDateTime格式化成为一个字符串
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s = localDateTime.format(pattern);
        System.out.println(s);
    }


}

package com.example.date;

public class DateTest02 {

    public static void main(String[] args) {

        // 获取自1970年1月1日0e:ee:ee 0ee到当前系统时间的总毫秒数。
        long time = System.currentTimeMillis();
        System.out.println(time);

        // 统计一个方法耗时
        long begin = System.currentTimeMillis();// 在调用目标方法之前记录一个毫秒数
        print();
        long end = System.currentTimeMillis();// 在执行完目标方法之后记录一个毫秒数

        System.out.println(end - begin);

    }

    // 需求:统计一个方法执行所耗费的时长
    public static void print(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

}

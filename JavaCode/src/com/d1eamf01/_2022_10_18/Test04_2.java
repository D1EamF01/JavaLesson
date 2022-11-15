package com.d1eamf01._2022_10_18;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Test04_2 {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        LocalDate nowTime = LocalDate.now();

//        System.out.println("请输入想要查询的年份：");
//        int year = sc.nextInt();
//        System.out.println("请输入想要查询的月份：");

//        int month = sc.nextInt();

//        int month;
        for (int i = 1; i <= 12; i++) {
//            month = i;
            ca.set(nowTime.getYear(),i,0);
            System.out.println(ca.get(Calendar.YEAR) + "年" + i + "月的天数为：" + ca.get(Calendar.DAY_OF_MONTH));
        }
    }
}

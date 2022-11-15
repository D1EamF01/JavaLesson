package com.d1eamf01._2022_11_15.test03.birthdaycheck;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        number = number.substring(6,14);
        int year = Integer.parseInt(number.substring(0, 4));
        int month = Integer.parseInt(number.substring(4, 6));
        int day = Integer.parseInt(number.substring(6, 8));

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        if(birthday.isAfter(now)){
            System.out.println("This year's birthday has not passed.");
        } else if(birthday.isBefore(now)){
            System.out.println("This year's birthday has passed.");
        }else {
            System.out.println("Today is birthday.");
        }
    }
}

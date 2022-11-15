package com.d1eamf01._2022_11_15.test03.LocalDate_Period;

import java.time.LocalDate;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.of(2003, 9,10);

        Period period = Period.between(birth, now);
        System.out.println(period.getYears() + "岁");
    }
}

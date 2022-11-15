package com.d1eamf01._2022_10_18;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month <= 0 || month > 12){
            System.out.println("输入错误");
        } else if((month % 2 != 0 && month != 2 && month <= 7)|| (month >= 8 && month % 2 == 0)){
            System.out.println("31天");
        } else if((month >= 4  && month <= 6 && month % 2 == 0) || (month % 2 != 0 && month >= 9)){
            System.out.println("30天");
        } else {
            System.out.println("28, 29天");
        }
    }
}

package com.d1eamf01._2022_11_10;

public class Test01 {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
        }
        catch (ArithmeticException a){
            System.out.println("不能为0");
            System.out.println(a.getMessage());
            a.printStackTrace();
        }
    }
}
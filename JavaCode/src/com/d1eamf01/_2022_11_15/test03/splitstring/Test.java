package com.d1eamf01._2022_11_15.test03.splitstring;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String(sc.next());
        System.out.println(str.replaceAll("\\d", "").toUpperCase());
    }
}

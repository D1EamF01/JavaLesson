package com.d1eamf01._2022_11_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList(){
            {
                add(0.138);
                add(0.153);
                add(0.167);
                add(0.179);
                add(0.188);
                add(0.195);
                add(0.199);
                add(0.202);
                add(0.203);
                add(0.203);
                add(0.203);
                add(0.203);
                add(0.202);
                add(0.201);
                add(0.198);
                add(0.192);
                add(0.184);
                add(0.173);
                add(0.159);
                add(0.145);
                add(0.130);
            }
        };
        double temp = 0.206;
        double res = 0.0;
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
//            res += Math.abs((arr.get(i) - temp));
            res += arr.get(i);
            System.out.println(res);
        }
        res /= 21;
        res = Math.abs((res - temp)) / temp;
        System.out.printf("res = %.2f%%", (res*100));
    }
}

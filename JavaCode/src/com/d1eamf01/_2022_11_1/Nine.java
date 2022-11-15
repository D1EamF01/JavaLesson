package com.d1eamf01._2022_11_1;

public class Nine {
    public static void main(String[] args) {
        nine(2);
    }
    public static void nine(int i){
        for (int i1 = 1; i1 <= i; i1++) {
            for (int i2 = 1; i2 <= i1; i2++) {
                System.out.printf(i2 + "*" + i1 + "=" + i1 * i2 + "\t");
            }
            if(i1 != i) System.out.println();
        }
    }
}

package com.d1eamf01._2022_10_20;

public class Test01 {
    public static void main(String[] args) {
        int[][][] a = new int[2][][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[3][];
        }
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                a[i][i1] = new int[2];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                for (int i2 = 0; i2 < a[i][i1].length; i2++) {
                    a[i][i1][i2] = i + i1 + i2;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                for (int i2 = 0; i2 < a[i][i1].length; i2++) {
                    System.out.println("a[" + i + "][" + i1 + "][" + i2 + "] = " + a[i][i1][i2]);
                }
            }
        }
    }
}

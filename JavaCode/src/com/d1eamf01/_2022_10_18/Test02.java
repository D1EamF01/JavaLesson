package com.d1eamf01._2022_10_18;

public class Test02 {
    public static void main(String[] args) {
        print99();
    }

    public static void print99(){
        for (int i = 1; i <= 9; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.printf(i1 + " * " + i + " = " + i * i1 + "\t");
            }
            if(i != 9) System.out.println();
        }
    }
}

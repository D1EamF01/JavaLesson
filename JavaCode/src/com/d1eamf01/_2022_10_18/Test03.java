package com.d1eamf01._2022_10_18;

public class Test03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println("for : " + sum);

        sum = 0;
        int i = 0;
        while(i < 11){
            sum += i++;
        }
        System.out.println("while : " + sum);
    }
}

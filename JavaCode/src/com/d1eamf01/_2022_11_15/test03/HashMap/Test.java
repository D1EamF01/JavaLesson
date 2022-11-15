package com.d1eamf01._2022_11_15.test03.HashMap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap(){
            {
                put('a',"Hello");
                put('b',"World");
            }
        };
        System.out.println(hashMap.get('a') + " " + hashMap.get('b'));
    }
}

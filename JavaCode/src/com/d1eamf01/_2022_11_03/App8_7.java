package com.d1eamf01._2022_11_03;

public class App8_7 {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(){
            @Override
            public boolean equals(Object o) {
                return false;
            }
        };
        obj1 = obj2;
        System.out.println("obj1.equals(obj2)" + " = " + obj1.equals(obj2));
//        System.out.println(obj2.c);
    }
}
class A{
    int a = 1;
//    static int c = 2;
}

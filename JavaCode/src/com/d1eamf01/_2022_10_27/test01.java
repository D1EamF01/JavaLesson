package com.d1eamf01._2022_10_27;

public class test01 {
    private static String s;

    static{
        s = "大大";
        System.out.println("这是静态初始化器");
    }
    {
        System.out.println("这是初始化器");
    }

    public test01() {
        System.out.println("test01构造器");
    }

    public static void main(String[] args) {
        System.out.println("进入代码阶段============");
        new test01();
        new test01();
        new test01();
        new test01();
        new test02();
    }
}

class test02{
    static {
        System.out.println("这是test02的静态初始化器");
    }
}
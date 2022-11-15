package com.d1eamf01._2022_10_25;
class Cylinder{
    private double radius;
    private int height;
    private double pi = 3.14;
    String color;

    private Cylinder() {
        System.out.println("无参构造器调用了");
    }

    public Cylinder(double radius, int height, String color) {
        this();
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public void show(){
        System.out.println("圆柱底半径为：" + radius);
        System.out.println("圆柱体的高为：" + height);
        System.out.println("圆柱的颜色为：" + color);
    }

    double area(){
        return pi * radius * radius;
    }

    double volume(){
        return area() * height;
    }
}
public class App7_7 {
    public static void main(String[] args) {
        Cylinder volu = new Cylinder(2.5, 5, "蓝色");
        System.out.println("圆柱底面积 = " + volu.area());
        System.out.println("圆柱体体积 = " + volu.volume());
        volu.show();
    }
}

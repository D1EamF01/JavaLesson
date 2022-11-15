package com.d1eamf01._2022_10_27;

class Cylinders
{
    private static int num=0;
    private static double pi=3.14;
    private double radius;
    private int height;
    public Cylinders(double r,int h)
    {
        radius=r;
        height=h;
        num++;
    }
    public static void count()
    {
        System.out.println("创建了"+num+"个对象");
    }
    double area()
    {
        return pi*radius*radius;
    }
    double volume()
    {
        return area()*height;
    }
}
public class App7_9
{
    public static void main(String[] args)
    {
        Cylinders.count();
        Cylinders volu1=new Cylinders(2.5,3);
        volu1.count();
        System.out.println("圆柱1的体积="+volu1.volume());
        Cylinders volu2=new Cylinders(1.0,2);
        Cylinders.count();
        System.out.println("圆柱2的体积="+volu2.volume());
        System.out.println(volu1);
        System.out.println(volu2);
    }
}
package com.d1eamf01._2022_10_25;

class Cylinde
{
    private double radius;
    private int height;
    private double pi=3.14;
    public void setCylinde(double r, int h)
    {
        if (r>0 && h>0)
        {
            radius=r;
            height=h;
        }
        else
            System.out.println("您的数据有错误！！");
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
public class App7_2
{
    public static void main(String[] args)
    {
        Cylinde volu=new Cylinde();
        volu.setCylinde(2,5);
        System.out.println("圆柱底面积="+volu.area());
        System.out.println("圆柱体体积="+volu.volume());
    }
}
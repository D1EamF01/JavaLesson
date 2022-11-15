package com.d1eamf01._2022_10_20;

class Cylinder
{
    double radius;
    int height;
    double pi=3.14;
    void area()
    {
        System.out.println("底面积="+pi* radius* radius);
    }
    double volume()
    {
        return (pi* radius* radius)*height;
    }
}
public class App6_1
{
    public static void main(String[] args)
    {
        Cylinder volu;
        volu=new Cylinder();
        volu.radius=2.8;
        volu.height=5;
//        System.out.println("底圆半径="+volu.radius);
//        System.out.println("圆柱的高="+volu.height);
//        System.out.print("圆柱");
//        volu.area();
//        System.out.println("圆柱体体积="+volu.volume());
        System.out.println(volu.pi);

        Cylinder volu2;
        volu2=new Cylinder();
        volu2.radius=2.8;
        volu2.height=5;
        volu2.pi = 3.15;
//        System.out.println("底圆半径="+volu2.radius);
//        System.out.println("圆柱的高="+volu2.height);
//        System.out.print("圆柱");
//        volu2.area();
//        System.out.println("圆柱体体积="+volu2.volume());
        System.out.println(volu2.pi);
    }
}


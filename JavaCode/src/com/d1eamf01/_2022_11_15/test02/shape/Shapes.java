package com.d1eamf01._2022_11_15.test02.shape;

interface Shape {
    void draw();
    void erase();
}
class Circle implements Shape {
    public void draw() { System.out.println("Circle.draw()");}
    public void erase() {  System.out.println("Circle.erase()");}
}
class Square implements Shape {
    public void draw() {System.out.println("Square.draw()"); }
    public void erase() {System.out.println("Square.draw()"); }
}
class Triangle implements Shape {
    public void draw() {System.out.println("Triangle.draw()"); }
    public void erase() {System.out.println("Triangle.draw()"); }
}
public class Shapes {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();
        Shape t = new Triangle();
        c.draw();
        c.erase();
        s.draw();
        s.erase();
        t.draw();
        t.erase();
    }
}


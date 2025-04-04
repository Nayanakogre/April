package com.xworkz.test;

public class Circle {
    double pie=3.14;
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public void area()
    {
        double area=pie*radius*radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.area();
        Circle circle1=new Circle(3);
        circle1.area();
        Circle circle2=new Circle(5);
        circle2.area();
        Circle circle3=new Circle(19);
        circle3.area();

    }
}

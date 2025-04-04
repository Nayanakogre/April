package com.xworkz.test;

public class Circle1 extends Shape{
    double pie=3.14;
    double radius=2.2;
    @Override
    public void calculateArea()
    {
        System.out.println("Running in Circle1 class");
        double area=pie*radius*radius;
        System.out.println(area);

    }
}

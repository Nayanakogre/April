package com.xworkz.test;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.calculateArea();
        System.out.println("-------------------");
        Reactangle1 reactangle=new Reactangle1();
        reactangle.calculateArea();
        System.out.println("-------------------");
        Circle1 circle=new Circle1();
        circle.calculateArea();

    }
}

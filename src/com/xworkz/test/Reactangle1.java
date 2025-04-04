package com.xworkz.test;

public class Reactangle1 extends Shape {
    int length=12;
    int breadth=12;
    int height=12;
    @Override
    public void calculateArea()
    {
        System.out.println("Running in Reactangle1  class");
        int area=length*breadth*height;
        System.out.println(area);
    }
}

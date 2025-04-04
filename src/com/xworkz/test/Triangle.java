package com.xworkz.test;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC)
    {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    public void checkValidTriangle()
    {
        if(sideA>0 && sideB>0 && sideC>0)
        {
            System.out.println("Valid Triangle");
        }
    }
    public void calculateArea()
    {
        double area=sideA*sideB*sideC;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle(12,12,12);
        triangle.checkValidTriangle();
        triangle.calculateArea();
    }
}

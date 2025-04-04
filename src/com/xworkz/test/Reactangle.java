package com.xworkz.test;

public class Reactangle {
    double length;
    double breadth;
    public Reactangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
        public void area()
        {
           double area=length*breadth;
            System.out.println("Area :"+area);

        }
        public void perimeter()
        {
            double perimeter=2*(length+breadth);
            System.out.println("Perimeter :"+perimeter);
        }

    public static void main(String[] args) {
        Reactangle reactAngle=new Reactangle(12.3,56);
        reactAngle.area();
        reactAngle.perimeter();
    }
    }


package com.xworkz.test;

public class Arthemetic {


    public void add(int num1,int num2)
    {
        int add=num1+num2;
        System.out.println("Addition of 2 int values :"+add);
    }
    public void add(double num1,double num2,double num3)
    {
        double add=num1+num2+num3;
        System.out.println("Addition of 3 double values :"+add);
    }

    public static void main(String[] args) {
        Arthemetic arthemetic=new Arthemetic();
        arthemetic.add(20,30);
        arthemetic.add(22.1,87765.900,5432.9876);
    }
}

package com.xworkz.test;

public class Calucalator {
    public void calculate(int num1,int num2)
    {
        int addition=num1+num2;
        System.out.println(addition);
    }
    public void calculate(float num1,float num2)
    {
        float substraction=num1-num2;
        System.out.println(substraction);
    }
    public void calculate(double num1,double num2)
    {
        double multiplication=num1*num2;
        System.out.println(multiplication);
    }

    public static void main(String[] args) {
        Calucalator calucalator=new Calucalator();
        calucalator.calculate(23,56);
        calucalator.calculate(12.89f,89.6f);
        calucalator.calculate(75.78664,764.90);
    }

}

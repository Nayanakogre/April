package com.xworkz.test;

public class Employee extends Person{
    double salary;
    public Employee(String name, int age,double salary)
    {
        super(name, age);
        this.salary=salary;
    }
    @Override
    public void personDetails()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

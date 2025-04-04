package com.xworkz.test;

public class Student {
    String name;
    int rollNumber;
    int marks;

    public Student(String name,
    int rollNumber,
    int marks)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public void studentDetails()
    {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student student=new Student("Nandan",101,90);
        student.studentDetails();
    }

}

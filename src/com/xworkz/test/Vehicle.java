package com.xworkz.test;

public class Vehicle {
     int vechicleNo;
     int modelNo;
     String owner;

    public Vehicle(int vechicleNo, int modelNo)
    {
        this.vechicleNo=vechicleNo;
        this.modelNo=modelNo;
        System.out.println(vechicleNo);
        System.out.println(modelNo);
    }
    public Vehicle(int vechicleNo, int modelNo,String owner)
    {
        this(vechicleNo,modelNo);
        this.owner=owner;
        System.out.println(vechicleNo);
        System.out.println(modelNo);
        System.out.println(owner);
    }

    public void vechicleDetails()
    {
        System.out.println("Running in Vechicle class");
    }
}

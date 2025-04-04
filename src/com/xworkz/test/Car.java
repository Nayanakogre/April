package com.xworkz.test;

public class Car extends Vehicle {
    String carName;


    public Car(int vechicleNo, int modelNo, String owner,String carName ) {
        super(vechicleNo, modelNo, owner);
        this.carName=carName;
        System.out.println(vechicleNo);
        System.out.println(modelNo);
        System.out.println(owner);
        System.out.println(carName);
    }

    @Override
    public void vechicleDetails()
    {
        super.vechicleDetails();
        System.out.println("Running in Car class");
    }

}

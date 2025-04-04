package com.xworkz.test;

public class VehicleRunner {
    public static void main(String[] args) {
        Car car=new Car(121,202,"Nayana","BMW");
        System.out.println("--------------------------------");
        Vehicle vehicle=new Vehicle(121,202,"Nayana");
        System.out.println("--------------------------------");
        Vehicle vehicle1=new Vehicle(121,2);
        System.out.println("--------------------------------");
        car.vechicleDetails();
        System.out.println("--------------------------------");
        vehicle.vechicleDetails();
    }
}

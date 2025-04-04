package com.xworkz.test;

public class Constroverloading {

    String testMonth;
    int testDate;


    public Constroverloading()
    {
        System.out.println("Running in no arg constructer");
    }
    public Constroverloading(int testDate)
    {
        this.testDate=testDate;
        System.out.println(this.testDate);
        System.out.println("Running 1 arg constructer of type Integer");
    }
    public Constroverloading(String testMonth)
    {
        this.testMonth=testMonth;
        System.out.println(this.testMonth);
        System.out.println("Running 1 arg constructer of type String");
    }
    public Constroverloading(int testDate,String testMonth)
    {
        this.testDate=testDate;
        this.testMonth=testMonth;
        System.out.println(this.testDate);
        System.out.println(this.testMonth);
        System.out.println("Running 2 arg constructer of type Integer and String Respectively");
    }
    public Constroverloading(String testMonth,int testDate)
    {
        this.testMonth=testMonth;
        this.testDate=testDate;
        System.out.println(this.testMonth);
        System.out.println(this.testDate);
        System.out.println("Running 2 arg constructer of type  String and Integer Respectively");
    }

    public static void main(String[] args) {
        Constroverloading constroverloading=new Constroverloading();
        Constroverloading constroverloading1=new Constroverloading(4);
        Constroverloading constroverloading2=new Constroverloading("April");
        Constroverloading constroverloading3=new Constroverloading(4,"April");
        Constroverloading constroverloading4=new Constroverloading("April",4);


    }

}

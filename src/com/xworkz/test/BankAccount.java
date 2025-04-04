package com.xworkz.test;

public class BankAccount {



        long accountNumber = 8787676565354l;
        String holderName = "Megha";
        double balance = 0;
        public void deposit ()
        {
            System.out.println("Running in deposit method");
        }
        public void withdraw ()
        {
            if (!(balance >= 0)) {
                System.out.println("Withdrwal does not allow negetive number");

            }
            System.out.println("Running in withdraw method");
        }
        public void displayDetails ()
        {
            System.out.println("Running in method display details");
        }

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit();
        bankAccount.withdraw();
        bankAccount.displayDetails();

    }
    }


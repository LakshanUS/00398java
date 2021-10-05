package com.company;

public class Main {
    static String name="Amalka";
    public static final int serialnum = 10;
    boolean isActive = false;

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("name : "+name);

        int valA = 10;
        double valB = (double) valA;
        int valC = valA/(int)2.5; // 10/2

        System.out.println("valC : "+ valC);

        int age =85;

        if (age<18) {
            System.out.println("NOt eligible for driving license");
        }
        else if(age>80) {
            System.out.println("Too old to drive. please submit a health check result");
        }
        else{
            System.out.println("Allowed to apply");
        }



    }
}

package com.example.addition;

public class Main {

    public static void main(String[] args) {
        Add obj = new Add();          // create object
        int result = obj.add(90, 5);   // call method
        System.out.println("Addition of a and b = " + result);
        Subtract s=new Subtract();
        int result1=s.subtract(90,6);
        System.out.println("subtraction of a and b = " + result1);
        Multiply m =new Multiply();
        int result2=m.Multiply(11,11);
        System.out.println("Multiplication of a and b = " + result2);
        Division d =new Division();
        int result3=d.Division(110,11);
        System.out.println("Division of a and b = " + result3);
        Remainder r=new Remainder();
        int result4=r.Remainder(11,11);
        System.out.println("Remainder of a and b = " + result4);


    }
}


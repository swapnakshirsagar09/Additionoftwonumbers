package com.example.addition;

public class Main {

    public static void main(String[] args) {
        Add obj = new Add();          // create object
        int result = obj.add(2, 5);   // call method
        System.out.println("Addition of a and b = " + result);
    }
}


package com.kole;

public class Main {

    public static void main(String[] args) {

        //width of int i= 32 (4 bytes).
        int myIntValue = 5 / 2;
        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleVlaue = " + myDoubleValue);

        int numberOfPounds = 5;
        double kilograms = numberOfPounds * 0.45359237;
        System.out.println(numberOfPounds + " pounds equals " + kilograms + " kilograms");

    }
}

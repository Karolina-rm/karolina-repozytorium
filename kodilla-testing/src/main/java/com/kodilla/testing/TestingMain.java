package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        System.out.println("First unit test:");

        Calculator myFirstCalculator = new Calculator();

        int subtraction = myFirstCalculator.subtract(5, 2);
        if (subtraction == 3) {
            System.out.println("Test ok");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Second unit test:");

        Calculator mySecondCalculator = new Calculator();

        int addition = mySecondCalculator.add(1,3);
        if (addition == 4) {
            System.out.println("Test ok");
        } else {
            System.out.println("Test failed");
        }



    }
}

package com.demo;

public class CalculatorA {

    public int calculateSum(int a, int b) {
        int result = 0;

        // Duplicate logic
        for (int i = a; i <= b; i++) {
            result = result + i;
        }

        return result;
    }

    public int calculateSquareSum(int a, int b) {
        int result = 0;

        // Duplicate logic
        for (int i = a; i <= b; i++) {
            result = result + i;
        }

        return result * result;
    }
}

package com.demo;

public class CalculatorB {

    public int calculateSum(int a, int b) {
        int result = 0;

        // Duplicate logic (same as CalculatorA)
        for (int i = a; i <= b; i++) {
            result = result + i;
        }

        return result;
    }

    public int calculateCubeSum(int a, int b) {
        int result = 0;

        // Duplicate logic again
        for (int i = a; i <= b; i++) {
            result = result + i;
        }

        return result * result * result;
    }
}

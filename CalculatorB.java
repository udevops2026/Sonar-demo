package com.demo;

public class CalculatorB {

    public int method1() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
            sum += i * 2;
            sum += i * 3;
            sum += i * 4;
            sum += i * 5;
            sum += i * 6;
            sum += i * 7;
            sum += i * 8;
            sum += i * 9;
            sum += i * 10;
        }
        return sum;
    }
}

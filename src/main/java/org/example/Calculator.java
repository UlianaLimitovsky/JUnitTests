package org.example;

public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }
    public float minus(float a, float b) {
        return a - b;
    }
    public double division(double a, double b) {
        return  a / b;
    }
    public double division(int a, int b) {
        return  a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public boolean isEven(int a) {
       return a % 2 == 0;
    }
}

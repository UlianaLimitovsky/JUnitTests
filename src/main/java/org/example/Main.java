package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второй число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите знак: ");
        String sign = sc.next();

        switch (sign) {
            case "+"-> System.out.println(calculator.plus(num1, num2));
            case "-"-> System.out.println(calculator.minus(num1, num2));
            case ":"-> System.out.println(calculator.division(num1, num2));
            case "*"-> System.out.println(calculator.multiplication(num1, num2));
        }
    }
}
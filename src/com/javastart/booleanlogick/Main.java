package com.javastart.booleanlogick;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int firstNumber = 10;
        int secondNumber = 5;
        int sum;


        sum = firstNumber + secondNumber;
        System.out.println("Сумма: " + sum);
        System.out.println("Остаток от деления: " + (firstNumber % secondNumber));

        if (true) {
            differenceFunction(firstNumber, secondNumber);
        }
    }

    public static void differenceFunction(int number1, int number2) {
        System.out.println("Разница: " + (number1 - number2));
    }
}

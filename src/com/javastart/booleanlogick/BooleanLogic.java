package com.javastart.booleanlogick;

import java.util.Scanner;

public class BooleanLogic {

    public static void main(String[] args) {
        System.out.println("hello");

        Scanner inputFromLine = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        int number1 = -222342333;
        byte b = (byte) number1;


        String fistText = "Введите первое число";
        String secondText = "Введите второе число";
        String resultText = "Такого значения нет!";

        System.out.println(fistText);
        firstNumber = inputFromLine.nextInt();

        System.out.println(secondText);
        secondNumber = inputFromLine.nextInt();

        System.out.println("Какую выполнить операцию?");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");

        int operation = inputFromLine.nextInt();
        if (operation == 1) {
            result = firstNumber + secondNumber;
            System.out.println("Результат: " + result );
        } else if (operation == 2) {
            result = firstNumber - secondNumber;
            System.out.println("Результат: " + result );
        } else {
            System.out.println(resultText);
        }

    }


}

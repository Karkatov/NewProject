package com.javastart.booleanlogick;

import java.util.Arrays;
import java.util.Scanner;

public class Massive {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }
        printSumm(array);
        switchFunction(input.next());
    }


    public static void printSumm(int[] mass) {

        for (int element : mass) {
            System.out.println("Значение index: " + element);
        }
    }


    public static void switchFunction(String value) {

        switch (value) {
            case "hello":
                System.out.println("hello222");
                break;
            case "bay":
                System.out.println("bay111");
                break;
            default :
                System.out.println("Default");
                break;
        }
    }
}

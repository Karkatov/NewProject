package com.javastart.booleanlogick;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkFive {


    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите размер массива!");
        int countArray = input.nextInt();
        int[] array = new int[countArray];

        Random random = new Random();

        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(30);
            System.out.println("Добавлено значение: " + array[index]);
        }

        int number = input.nextInt();
        for (int element: array) {
            if (element == number) {
                System.out.println("Число совпало - " + number);
            } else {
                System.out.println("Число не совпало!");
            }
        }
    }

}





//    public static int createArray() {
//            System.out.println("Укажите размер массива!");
//            int countElements = input.nextInt();
//            return 1;
//        }
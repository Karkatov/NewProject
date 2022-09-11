package com.javastart.workwithclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human onePerson = createHuman();
        Human twoPerson = createHuman();

        Work work = new Work();
         String oldAgePerson = work.startWork(onePerson, twoPerson);
         System.out.println("Самый взрослый человек - " + oldAgePerson);
    }

    private static Human createHuman() {

        Scanner inputFromLine = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = inputFromLine.next();

        System.out.println("Введите количество лет");
        int age = inputFromLine.nextInt();

        Human newPerson = new Human();
        newPerson.setAge(age);
        newPerson.setName(name);
        return newPerson;
    }

}

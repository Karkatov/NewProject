package com.javastart.workwithclass;

public class Work {

    public String startWork(Human one, Human two) {
        System.out.println(one.getName() + " " + + one.getAge() + " - начал работу");
        System.out.println(two.getName() + " " + two.getAge() + " - начал работу");

        if (one.getAge() > two.getAge()) {
            return one.getName();
        } else {
            return two.getName();
        }
    }
}

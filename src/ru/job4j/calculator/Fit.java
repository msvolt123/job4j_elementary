package ru.job4j.calculator;

import ru.job4j.converter.Converter;

public class Fit {

    public static double manWaight(short height) {

        return (height - 100) * 1.15;
    }

    public static double womanWaight(short height) {

        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWaight(height);
        double woman = Fit.womanWaight(height);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 180 is " + woman);

    }

}

package ru.job4j.converter;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.*;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarToRuble(int value) {
        return 60 * value;
    }

    public static int euroToRuble(int value) {
        return 70 * value;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int in1 = 200;
        int expected1 = 3;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("200 rubles are 3. Test result : " + passed1);
        int dollar = Converter.rubleToDollar(200);
        System.out.println("200 rubles are " + dollar + " dollar.");

        int in2 = 12;
        int expected2 = 720;
        int out2 = Converter.dollarToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("12 dollars are 720. Test result : " + passed2);
        int ruble1 = Converter.dollarToRuble(12);
        System.out.println("12 dollars are " + ruble1 + " rubles.");

        int in3 = 7;
        int expected3 = 490;
        int out3 = Converter.euroToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("7 euro are 490. Test result : " + passed3);
        int ruble2 = Converter.euroToRuble(7);
        System.out.println("7 euro are " + ruble2 + " rubles.");

    }
}

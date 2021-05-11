package ru.job4j.ru.job4j.converter;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.*;

public class Converter {

    public static int rubleToEuro (int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar (int value) {
        int rsl = value / 60;
        return rsl;
    }
    public static int dollarToRuble (int value) {
        int rsl = 60 * value;
        return rsl;
    }
    public static int euroToRuble (int value) {
        int rsl = 70 * value;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(200);
        System.out.println("200 rubles are " + dollar + " dollar.");
        int ruble1 = Converter.dollarToRuble(12);
        System.out.println("12 dollars are " + ruble1 + " rubles.");
        int ruble2 = Converter.euroToRuble(7);
        System.out.println("7 euro are " + ruble2 + " rubles.");

    }
}

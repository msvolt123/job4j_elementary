package ru.job4j.calculator;

import ru.job4j.math.*;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDivAndDiff(double first, double second) {
        return division(first, second) + difference(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + division(first, second) + difference(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDivAndDiff(12, 18));
        System.out.println("Результат расчета равен: " + sumAll(19, 14));
    }

}
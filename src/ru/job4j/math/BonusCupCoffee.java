package ru.job4j.math;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        if (count >= n) {
            count = count + (count + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCup(213, 6));
    }
}

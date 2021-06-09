package ru.job4j.math;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        if (count == n) {
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCup(7, 6));
    }
}

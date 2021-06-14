package ru.job4j.exercises;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
            if (count >= n) {
                count = (count / n) + count;
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(countCup(213, 6));
    }
}

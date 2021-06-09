package ru.job4j.math;

public class Game {
    public static double checkGame(double percent, int prize, int pay) {
        if ((prize * percent) >= pay) {
            return (prize * percent) - pay;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkGame(0.9, 1, 2));
    }
}

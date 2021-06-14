package ru.job4j.exercises;

public class Game {
    public static double checkGame(double percent, int prize, int pay) {
        if ((percent * prize) > pay) {
            return (int) (percent * prize - pay);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkGame(0.8, 30, 11));
    }
}

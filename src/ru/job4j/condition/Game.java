package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equals("Tanks")) {
            System.out.println("Start - Tanks");
        }
        if (name.equals("Tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("Tanks");
    }
}

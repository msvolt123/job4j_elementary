package ru.job4j.exercises;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        int added = left + right;
        int subtracted = left - right;
        int multiplied = left * right;
        int divided = left / right;
        if (left + right == rsl) {
            return "added";
        } else if (left - right == rsl) {
            return "subtracted";
        } else if (left * right == rsl) {
            return "multiplied";
        } else if (left / right == rsl) {
            return "divided";
        } else {
            return "none";
        }
    }
}


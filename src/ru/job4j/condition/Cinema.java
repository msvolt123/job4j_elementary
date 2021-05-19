package ru.job4j.condition;

public class Cinema {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        System.out.println(allowByParent && hasMoney ? "I can go to the cinema." : "I can't.");
    }

    public static void main(String[] args) {
        Cinema.permission(true, true);
        Cinema.permission(true, false);
        Cinema.permission(false, true);
        Cinema.permission(false, false);

    }
}

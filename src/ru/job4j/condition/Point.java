package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = (x2 - x1);
        double rsl2 = (y2 - y1);
        double first = Math.pow(rsl1, 2);
        double second = Math.pow(rsl2, 2);
        double rsl = (first + second);
        double fin = Math.sqrt(rsl);
        return fin;

    }

    public static void main(String[] args) {
        double result = Point.distance(2, 1,6, 5);
        System.out.println(result);
    }
}

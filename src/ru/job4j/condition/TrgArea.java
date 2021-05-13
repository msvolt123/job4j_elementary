package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double four = Math.sqrt(16);
        double rsl1 = (four * (four - a) * (four - b) * (four - c));
        double rsl = Math.sqrt(rsl1);
        return rsl;
    }
    public static void main(String[] args) {
        double rsl = TrgArea.area(2,2,2);
        System.out.println("area (a,b,c) = " + rsl);
    }
}

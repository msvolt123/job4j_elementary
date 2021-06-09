package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        return (l.charAt(0) == r.charAt(r.length() - 1)) && (l.charAt(l.length() - 1) == r.charAt(0));

}

    public static void main(String[] args) {
        boolean rsl = PairsCharString.check(" ", " ");
        System.out.println(rsl);
    }
}

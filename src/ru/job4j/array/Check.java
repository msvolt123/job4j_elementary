package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean rst = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                rst = false;
                break;
            }
        }
        return rst;

    }
}

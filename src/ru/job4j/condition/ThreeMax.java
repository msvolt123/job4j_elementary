package ru.job4j.condition;

import javax.print.attribute.standard.MediaSize;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;

        if (second >= first && second >= third) {
            result = second;
        }
        if (third >= second && third >= first) {
            result = third;
        }
        return result;
    }
}


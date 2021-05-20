package ru.job4j.condition;

import com.sun.source.tree.BreakTree;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) == Math.abs(y1 - y2) ? Math.abs(y2 - y1) : 0;

    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(2, 6, -1, 1));
    }
}
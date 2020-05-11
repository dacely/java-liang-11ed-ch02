package com.exercises;

public class E2_18_PrintTable {
    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 1;

        System.out.println("    a          b      Middle Point");
        double x3 = (x1 + x2) / 2.0;
        double y3 = (y1 + y2) / 2.0;
        System.out.printf("(%2d, %2d)   (%2d, %2d)   (%.1f, %.1f)\n", x1, y1, x2, y2, x3, y3);

        x1 = 1;
        y1 = 4;
        x2 = 4;
        y2 = 2;
        x3 = (x1 + x2) / 2.0;
        y3 = (y1 + y2) / 2.0;
        System.out.printf("(%2d, %2d)   (%2d, %2d)   (%.1f, %.1f)\n", x1, y1, x2, y2, x3, y3);

        x1 = 2;
        y1 = 7;
        x2 = 6;
        y2 = 3;
        x3 = (x1 + x2) / 2.0;
        y3 = (y1 + y2) / 2.0;
        System.out.printf("(%2d, %2d)   (%2d, %2d)   (%.1f, %.1f)\n", x1, y1, x2, y2, x3, y3);

        x1 = 3;
        y1 = 9;
        x2 = 10;
        y2 = 5;
        x3 = (x1 + x2) / 2.0;
        y3 = (y1 + y2) / 2.0;
        System.out.printf("(%2d, %2d)   (%2d, %2d)   (%.1f, %.1f)\n", x1, y1, x2, y2, x3, y3);

        x1 = 4;
        y1 = 11;
        x2 = 12;
        y2 = 7;
        x3 = (x1 + x2) / 2.0;
        y3 = (y1 + y2) / 2.0;
        System.out.printf("(%2d, %2d)   (%2d, %2d)   (%.1f, %.1f)\n", x1, y1, x2, y2, x3, y3);
    }
}

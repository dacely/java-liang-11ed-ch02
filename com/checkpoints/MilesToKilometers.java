package com.checkpoints;

public class MilesToKilometers {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;
        double miles = 100;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.printf("kilometers = %1$.2f", kilometers);
    }
}

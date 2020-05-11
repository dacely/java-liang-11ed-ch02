package com.exercises;

import java.util.Scanner;

public class E2_04_SquareMeterToPing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in square meters: ");
        double squareMeters = input.nextDouble();
        double pings = squareMeters * 0.3025;
        System.out.printf("%.2f square meters are %.2f pings", squareMeters, pings);
    }
}

package com.exercises;

import java.util.Scanner;

public class E2_10_HeatWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double M = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double t0 = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double t1 = input.nextDouble();

        double Q = M * (t1 -t0) * 4184;
        System.out.printf("The energy needed is %.2f", Q);
    }
}

package com.exercises;

import java.util.Scanner;

public class E2_12_RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double runwayLength = Math.pow(speed, 2) / (2 * acceleration);
        System.out.printf("The minimum runway length for this airplane is %.2f", runwayLength);
    }
}

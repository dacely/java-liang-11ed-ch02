package com.exercises;

import java.util.Scanner;

public class E2_01_MilesToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        double kilometers = miles * 1.609344;
        System.out.printf("%.2f miles are %.2f kilometers\n", miles, kilometers);
    }
}

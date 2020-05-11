package com.exercises;

import java.util.Scanner;

public class E2_14_BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.printf("Body Mass Index: %.2f", bmi);
    }
}

package com.exercises;

import java.util.Scanner;

public class E2_03_MetersToFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for meters: ");
        double meters = input.nextDouble();
        double feet = meters / 0.3048;
        System.out.printf("%.2f meters are %.2f feet", meters, feet);
    }
}

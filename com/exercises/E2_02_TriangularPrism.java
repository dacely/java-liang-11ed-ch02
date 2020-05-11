package com.exercises;

import java.util.Scanner;

public class E2_02_TriangularPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides of an equilateral triangle: ");
        double lengthSide = input.nextDouble();
        System.out.print("Enter height of the prism: ");
        double height = input.nextDouble();
        double triangleArea = Math.sqrt(3) * Math.pow(lengthSide, 2) / 4;
        double prismVolume = triangleArea * height;
        System.out.printf("Triangle Area: %.2f\n", triangleArea);
        System.out.printf("Prism Volume: %.2f\n", prismVolume);
    }
}

package com.examples;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.1415926535;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.printf("The area for the circle of radius %1$.2f is %2$.2f", radius, area);
    }
}

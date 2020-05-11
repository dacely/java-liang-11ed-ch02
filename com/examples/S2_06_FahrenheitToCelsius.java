package com.examples;

import java.util.Scanner;

public class S2_06_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        double tempFahrenheit = input.nextDouble();
        double tempCelsius = (tempFahrenheit - 32) * (5.0 / 9);
        System.out.printf("%.2f°F = %.2f°C", tempFahrenheit, tempCelsius);
    }
}

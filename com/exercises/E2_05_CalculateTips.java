package com.exercises;

import java.util.Scanner;

public class E2_05_CalculateTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subTotal * (gratuityRate / 100);
        double total = subTotal + gratuity;
        System.out.printf("Subtotal: %,10.2f \n", subTotal);
        System.out.printf("Gratuity: %,10.2f \n", gratuity);
        System.out.printf("Total:    %,10.2f \n", total);
    }
}

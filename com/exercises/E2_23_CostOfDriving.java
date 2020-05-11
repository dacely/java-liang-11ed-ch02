package com.exercises;

import java.util.Scanner;

public class E2_23_CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double efficiency = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double totalGallons = distance / efficiency;
        double totalPrice = pricePerGallon * totalGallons;

        System.out.printf("The cost of driving is %.2f", totalPrice);
    }
}

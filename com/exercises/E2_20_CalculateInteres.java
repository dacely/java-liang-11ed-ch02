package com.exercises;

import java.util.Scanner;

public class E2_20_CalculateInteres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        double interest = balance * (annualInterestRate / 1200);
        System.out.printf("The interest is %.2f", interest);
    }
}

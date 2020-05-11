package com.exercises;

import java.util.Scanner;

public class E2_21_FutureInvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.printf("Future value is %.2f", futureInvestmentValue);
    }
}

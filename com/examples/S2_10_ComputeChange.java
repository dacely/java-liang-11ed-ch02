package com.examples;

import java.util.Scanner;

public class S2_10_ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount of money, for example 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        System.out.printf("Your amount %.2f consist of: \n", amount);
        System.out.printf("\t %d dollars \n", numberOfDollars);
        System.out.printf("\t %d quarters \n", numberOfQuarters);
        System.out.printf("\t %d dimes \n", numberOfDimes);
        System.out.printf("\t %d nickels \n", numberOfNickels);
        System.out.printf("\t %d pennies \n", remainingAmount);
    }
}

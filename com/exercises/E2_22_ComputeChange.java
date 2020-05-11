package com.exercises;

import java.util.Scanner;

public class E2_22_ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount of cents: ");
        int amount = input.nextInt();
        int remainingAmount = amount;
        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        System.out.printf("Your amount %d consist of: \n", amount);
        System.out.printf("\t %d dollars \n", numberOfDollars);
        System.out.printf("\t %d quarters \n", numberOfQuarters);
        System.out.printf("\t %d dimes \n", numberOfDimes);
        System.out.printf("\t %d nickels \n", numberOfNickels);
        System.out.printf("\t %d pennies \n", remainingAmount);
    }
}

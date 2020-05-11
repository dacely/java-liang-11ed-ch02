package com.examples;

import java.util.Scanner;

public class S2_08_SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.17;
        System.out.print("Sales tax is $" + (int) (tax * 100) / 100.0);
    }
}

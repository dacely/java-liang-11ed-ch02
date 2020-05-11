package com.exercises;

import java.util.Scanner;

public class E2_13_CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double m = input.nextDouble();
        double v1 = m * 1.003125;
        double v2 = (v1 + m) * 1.003125;
        double v3 = (v2 + m) * 1.003125;
        double v4 = (v3 + m) * 1.003125;
        double v5 = (v4 + m) * 1.003125;
        double v6 = (v5 + m) * 1.003125;
        System.out.printf("After the first month, the account value is %.2f \n", v1);
        System.out.printf("After the second month, the account value is %.2f \n", v2);
        System.out.printf("After the third month, the account value is %.2f \n", v3);
        System.out.printf("After the fourth month, the account value is %.2f \n", v4);
        System.out.printf("After the fifth month, the account value is %.2f \n", v5);
        System.out.printf("After the sixth month, the account value is %.2f \n", v6);
    }
}

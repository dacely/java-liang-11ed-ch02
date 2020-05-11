package com.exercises;

import java.util.Scanner;

public class E2_06_MultiplyDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 999: ");
        int num = input.nextInt();
        int n1 = num % 10;
        num /= 10;
        int n2 = num % 10;
        int n3 = num / 10;
        int product = n1 * n2 * n3;
        System.out.printf("%d * %d * %d = %d \n", n3, n2, n1, product);
    }
}

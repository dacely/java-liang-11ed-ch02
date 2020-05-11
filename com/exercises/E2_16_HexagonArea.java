package com.exercises;

import java.util.Scanner;

public class E2_16_HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
        System.out.printf("The area of the hexagon is %.2f", area);
    }
}

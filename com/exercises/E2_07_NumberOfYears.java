package com.exercises;

import java.util.Scanner;

public class E2_07_NumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Enter the number of minutes: ");
        long totalMinutes = input.nextLong();
        long totalDays = totalMinutes / (60 * 24);
        long totalYears = totalDays / 365;
        long remainingDays = totalDays % 365;
        System.out.printf("%d minutes is approximately %d years and %d days\n", totalMinutes, totalYears, remainingDays);
    }
}

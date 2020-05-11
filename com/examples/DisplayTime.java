package com.examples;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        int totalSeconds = input.nextInt();
        int totalMinutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;
        System.out.printf("%d seconds are %d minutes and %d seconds", totalSeconds, totalMinutes, remainingSeconds);
    }
}

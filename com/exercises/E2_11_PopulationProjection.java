package com.exercises;

import java.util.Scanner;

public class E2_11_PopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        int seconds = years * 365 * 24 * 3600;
        int currentPopulation = 312_032_486;

        int newborns = seconds / 7;
        int immigrants = seconds / 45;
        int deaths = seconds / 13;
        int futurePopulation = currentPopulation + newborns + immigrants - deaths;

        System.out.printf("The population in 5 years will be: %,d", futurePopulation);
    }
}

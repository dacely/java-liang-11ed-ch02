package com.examples;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;

        radius = 20;
        area = radius * radius * 3.1415926535;

        System.out.printf("The area for the circle of radius %1$.2f is %2$.2f", radius, area);
    }
}

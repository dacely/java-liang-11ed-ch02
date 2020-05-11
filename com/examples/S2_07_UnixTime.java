package com.examples;

public class S2_07_UnixTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = (totalMinutes / 60) - 5;

        long currentSeconds = totalSeconds % 60;
        long currentMinutes = totalMinutes % 60;
        long currentHours = totalHours % 24;

        System.out.printf("%02d:%02d:%02d", currentHours, currentMinutes, currentSeconds);
    }
}

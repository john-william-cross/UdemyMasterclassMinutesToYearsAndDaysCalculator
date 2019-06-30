package com.johncross;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(10561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            if (days % 365 != 0) {
                days = days % 365;
            } else {
                days = 0;
            }
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

}


/*
"XX min = YY y and ZZ d"
 */
package org.noushin.examples;

public class Main {
    public static void main(String[] args) {
        // This example is for weekdays; specifically, it maps numbers (1 to 7) to days of the week using a switch statement..
        int day=4;
       String dayName= switch (day){
           case 1 -> "Monday";
           case 2 -> "Tuesday";
           case 3 -> "Wednesday";
           case 4 -> "Thursday";
           case 5 -> "Friday";
           case 6 -> "Saturday";
           case 7 -> "Sunday";
           default -> "Invalid day";

        };
       System.out.println(dayName);

    }
}
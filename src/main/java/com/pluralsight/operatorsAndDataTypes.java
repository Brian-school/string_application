package com.pluralsight;

public class operatorsAndDataTypes {
    static void main() {
        int hours = 22;
        int minutes = 45;
        int minutesToAdd = 150;

        // Calculate the new hour and minute.
        // NO IF STATEMENTS
        int new_hour = (hours + (minutesToAdd / 60)) % 24;
        int new_minute = (minutes + minutesToAdd) % 60;
        // Print the result.

        System.out.println("The adjusted time is: " + new_hour + "h" + new_minute + "m");
    }
}

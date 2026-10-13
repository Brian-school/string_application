package com.pluralsight;

public class operatorsAndDataTypes {
    static void main() {
        int exercise = 3;

        if (exercise == 1) {
            int hours = 22;
            int minutes = 45;
            int minutesToAdd = 150;

            // Calculate the new hour and minute.
            // NO IF STATEMENTS
            int new_hour = (hours + (minutesToAdd / 60)) % 24;
            int new_minute = (minutes + minutesToAdd) % 60;
            // Print the result.

            System.out.println("The adjusted time is: " + new_hour + "h" + new_minute + "m");

            // stretch challenge
            int manyMinutes = 10_000;
            int daysPassed = (manyMinutes / 60) / 24;
            System.out.println(manyMinutes + " minutes would be " + daysPassed + " complete days");
        } else if (exercise == 2) {

            int [] movie_time = {125, 98, 142};
            int totalDurationMins = movie_time[0] + movie_time[1] + movie_time[2];
            int totalDurationHours = totalDurationMins / 60;
            int totalDurationLeftoverMins = totalDurationMins % 60;

            System.out.println("Watched movies for " + totalDurationHours + "h and " + totalDurationLeftoverMins + "m");

            // Stretch Challenge

            int startTimeHours = 19;
            int startTimeMins = 30;

            int new_hour = (startTimeHours + (totalDurationMins / 60)) % 24;
            int new_minute = (startTimeMins + totalDurationMins) % 60;

            System.out.println("With a start time of " + startTimeHours + "h" + startTimeMins + "m,");
            System.out.println("The movie marathon would stop at " + new_hour + "h" + new_minute + "m");
        } else if (exercise == 3) {
            /*
                There are **23 people**. Everyone wants **3 slices** of pizza, and each pizza has **8 slices**.

                1. Calculate how many slices you need in total.
                2. Calculate the minimum number of whole pizzas to order.
                3. Calculate how many slices will be left over.
            */

            int people = 23;
            int slicesPerPerson = 3;
            int slicesPerPizza = 8;
            int slicesNeeded = people * slicesPerPerson;
            int pizzasNeeded = (slicesNeeded / slicesPerPizza) + ((slicesNeeded % slicesPerPizza) / (slicesNeeded % slicesPerPizza));

            System.out.println("For the party, we will need " + pizzasNeeded + " pizzas");

            // **Stretch challenge:** Make your calculation work for **31 people**, **2 slices each**, and **6 slices per pizza** by changing only the input variables.
            people = 31;
            slicesPerPerson = 2;
            slicesPerPizza = 6;
            slicesNeeded = people * slicesPerPerson;
            pizzasNeeded = (slicesNeeded / slicesPerPizza) + ((slicesNeeded % slicesPerPizza) / (slicesNeeded % slicesPerPizza));
            System.out.println("For the party, we will need " + pizzasNeeded + " pizzas");
        } else if (exercise == 4) {
            
        }
    }
}

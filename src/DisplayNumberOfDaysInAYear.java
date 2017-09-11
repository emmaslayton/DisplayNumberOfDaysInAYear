/** “DisplayNumberOfDaysInAYear."
 *
 *  @author Emma Slayton
 *  Created: 9/8/17
 *  Last updated: 9/10/17
 *
 *  Project 6; CSC201-004N
 *  Assignment 6.16
 *
 */

public class DisplayNumberOfDaysInAYear {
    public static int numberOfDaysInAYear(int year){
        /* If Leap Year, Return 366, otherwise Return 365 */
        int numberOfDays = 0;

        /* Test if year is a Leap year */
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            numberOfDays = 366; /* It is a Leap Year */
        else numberOfDays = 365;

        return numberOfDays;
    }

    public static void main(String[] args) {
        /* For Years 2000 to 2020, Display the Number of Days in the Year */
        System.out.println(" Year " + " Number Of Days");
        System.out.println("------" + " --------------");

        for (int i = 2000; i < 2021; i++){
            System.out.println(" " + i + "       " + numberOfDaysInAYear(i));
        }
    }
}

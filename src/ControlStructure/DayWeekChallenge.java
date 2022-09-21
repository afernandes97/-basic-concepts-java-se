package ControlStructure;

import java.util.Scanner;

public class DayWeekChallenge {
    public static void main(String[] args) {
        /** This challenge going solicit a day to user, and compare to:
         * Sunday -> 1
         * Monday -> 2
         * Tuesday -> 3
         * Wednesday -> 4
         * Thursday -> 5
         * Friday -> 6
         * Saturday -> 7
         **/

        Scanner entry = new Scanner(System.in);

        System.out.println("Please entry a day: ");
        String day = entry.nextLine();

        day.toUpperCase();


        if(day.equalsIgnoreCase("Sunday")){
            System.out.println("Sunday -> 1");
        } else if(day.equalsIgnoreCase("Monday")){
            System.out.println("Monday -> 2");
        }else if(day.equalsIgnoreCase("Tuesday")){
            System.out.println("Tuesday -> 3");
        }else if(day.equalsIgnoreCase("Wednesday")){
            System.out.println("Wednesday -> 4");
        }else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Thursday -> 5");
        }else if(day.equalsIgnoreCase("Friday")){
            System.out.println("Friday -> 6");
        }else if(day.equalsIgnoreCase("Saturday")){
            System.out.println("Saturday -> 7");
        }else{
            System.out.println("Please entry a valid day: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday.");
        }

    }
}

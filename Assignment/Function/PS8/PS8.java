/* PS8 :- Write a program in java which take number from 1 to 7 and print week days according to the
number */ 

import java.util.Scanner;

class WeekdayPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1 to 7): ");
        int dayNumber = scanner.nextInt();

        String dayOfWeek = getDayOfWeek(dayNumber);
        if (dayOfWeek != null) {
            System.out.println("Day of the week: " + dayOfWeek);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
 
    }

    // Helper function to get the day of the week
    static String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return null; // Invalid input
        }
    }
}

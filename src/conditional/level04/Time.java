// 4. Take 24-hour time (hours and minutes) and print whether it is AM or PM.


package conditional.level04;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter hours (0-23): ");
        int hours = in.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = in.nextInt();

        // Validate that the hours and minutes are real clock values
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Not a valid time range");
        }
        // 0 to 11 hours are always AM
        else if (hours >= 0 && hours < 12) {
            System.out.println("AM");
        }
        // 12 to 23 hours are always PM
        else {
            System.out.println("PM");
        }
    }
}

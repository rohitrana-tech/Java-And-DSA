// 10. Take a month number (1–12) and print the number of days in that month (ignore leap years).

package conditional.level02;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = in.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            System.out.println("print 31 days in that month");
        } else if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
            System.out.println("Print 30 days in that month");
        } else if (month == 2) {
            System.out.println("February buddy 28 days ");
        }else {
            System.out.println("Invalid ! Please Enter number between 1 to 12");
        }
    }
}

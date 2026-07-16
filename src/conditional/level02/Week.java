// 9. Take a day number (1–7) and print the corresponding day name

package conditional.level02;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int day = in.nextInt();

        if (day == 1){
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }else {
            System.out.println(" please enter number between 1 to 7 only");
        }
    }
}

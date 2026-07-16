package conditional.level01;
// 5. Check if a given year is a leap year

import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leapyear = in.nextInt();

        if ((leapyear % 4 == 0 && leapyear % 100 !=0) || (leapyear % 400 == 0)){
            System.out.println(leapyear + " is a leap year");
        }else {
            System.out.println("Not a leap year");
        }

    }
}

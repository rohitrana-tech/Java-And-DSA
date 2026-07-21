// 3. Take day and month and check if it forms a valid calendar date (ignoring leap years).

package conditional.level05;

import java.util.Scanner;

public class CalendarDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day: ");
        int days = in.nextInt();
        System.out.println("Enter month: ");
        int month = in.nextInt();

        if(month >=1 && month <=12)  {
            if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && days >= 1 && days <=31 ){
                System.out.println("Valid calendar date");
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && days>=1 && days <= 30 ) {
                System.out.println("Valid calendar date");
            }else if
                (month == 2 && days >= 1 && days <=28){
                System.out.println("Valid calendar date");
            }else {
                System.out.println("Not a valid calendar date ");
            }
        }else {
            System.out.println("Not a valid calendar date");
        }
    }
}

//9. Take two dates (day and month) and determine which one comes first in the calendar.

package conditional.level05;

import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Date 1 (Day and month):");
        int day1 = in.nextInt();
        int month1 = in.nextInt();

        System.out.println("Enter the Date 2 (Day and month):");
        int day2 = in.nextInt();
        int month2 = in.nextInt();

        if((day1 >= 1 && day1 <=31) && (month1 >= 1 && month1 <= 12 ) && (day2 >= 1 && day2 <=31) && (month2 >= 1 && month2 <= 12 ) ){
            if(month1 != month2 ){
                 if(month1 > month2 ){
                     System.out.println("Date 2 comes first: " + day2 + "/" + month2);
                 } else if (month2 > month1) {
                     System.out.println("Date 1 comes first: " + day1 + "/" + month1);
                 }
            }if( month2 == month1){
                if(day1 > day2){
                    System.out.println("Date 2 comes first: " + day2 + "/" + month2);
                } else if (day2 > day1) {
                    System.out.println("Date 1 comes first: " + day1 + "/" + month1);
                }else {
                    System.out.println("Both dates are the same: " + day1 + "/" + month1);
                }
            }
        }else {
            System.out.println("entered month or day is invalid ");
        }
    }
}

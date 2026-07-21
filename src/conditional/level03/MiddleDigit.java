// 2. Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.

package conditional.level03;

import java.util.Scanner;

public class MiddleDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 digit number: ");
        int num = in.nextInt();
        if (num < 100 || num > 999) {
            System.out.println("Please Enter a 3 digit number");
        } else {

            int hundred = num / 100;
            int tens = (num / 10) % 10;
            int unit = num % 10;
        
        

         if (hundred > tens && unit > tens) {
                System.out.println("Middle digit is smallest");
            } else if (hundred < tens && unit < tens) {
                System.out.println("Middle digit is greatest");
            } else {
                System.out.println("Neither");
            }
        }
    }
}
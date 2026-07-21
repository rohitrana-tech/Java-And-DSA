// 7. Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.

package conditional.level05;

import java.util.Scanner;

public class SumCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 3 digit number ");
        int num = in.nextInt();







        if (num >= 100 && num <= 999) {

            int   hundred  = num /100;
            int   tens = (num /10)%10;
            int   ones = num % 10;

            if(ones + hundred == tens){
                System.out.println("Sum is equal to middle digit");
            }else {
                System.out.println("Not equal");
            }
        }else {
            System.out.println("only three digit number are allowed");
        }
    }
}

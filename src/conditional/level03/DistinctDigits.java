// 1. Take a 3-digit number and check if all digits are distinct.

package conditional.level03;

import java.util.Scanner;

public class DistinctDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 digit number: ");
        int num = in.nextInt();

        int hundred = num/100;
        int ten = (num/10)%10;
        int unit = num%10;

        if(num < 100 || num > 999){
            System.out.println("Enter a 3 digit number");
        } else if (hundred != ten || ten != unit || unit != hundred) {

            System.out.println("Digits are distinct ");
        }else{
            System.out.println("Digits are equal ");
        }

    }
}

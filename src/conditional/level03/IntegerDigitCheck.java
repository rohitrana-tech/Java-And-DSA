// 4. Check whether a given integer is single-digit, double-digit, or multi-digit.

package conditional.level03;

import java.util.Scanner;

public class IntegerDigitCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num < 10 && num > -10){
            System.out.println("number is single digit");
        } else if( (num < 100 && num >= 10) || (num > -100 && num <= -10) ) {
            System.out.println("number is double digit");
        }else {
            System.out.println("number is multi digit");
        }
    }
}

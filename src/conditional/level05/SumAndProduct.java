//  8. Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.

package conditional.level05;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = in.nextInt();

        if(num >=1 && num <=9999){
            int thousand = num /1000;
            int hundred = (num / 100) %10;
            int tens = (num / 10)% 10;
            int ones = num % 10;

            int sum = thousand + hundred + tens + ones;


            int product = 1;
            if (thousand > 0) product *= thousand;
            if (num >= 100) product *= hundred;
            if (num >= 10) product *= tens;
            product *= ones;

            if(sum > product){
                System.out.println("sum is greater than product");
            }else {
                System.out.println("Sum is not greater");
            }

        }else {
            System.out.println("Please enter a valid number");
        }

    }
}

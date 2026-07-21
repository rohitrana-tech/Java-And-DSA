//10. Print the product of digits of a given number

package loops.level01;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int product = 1;


        while(num > 0) {

          int  rem  = num % 10;
            product = product * rem;
            num = num / 10;

        }
        System.out.println("Product of digits of a given number : " +product);
    }
}

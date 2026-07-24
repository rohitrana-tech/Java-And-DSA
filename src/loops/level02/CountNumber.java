// 1. Count the number of digits in a given number.

package loops.level02;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int count = 0;

        do {

            count = count + 1;

            num = num / 10;
        }while(num > 0);
        System.out.println("Count : " + count);
    }
}

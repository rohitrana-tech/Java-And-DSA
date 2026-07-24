// 7. Print all the prime number between 1 and 100.

package loops.level02;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        for (int i = 2; i <= 100 ; i++) {
            boolean isPrime = true;

            for(int j = 2; j <= i /2 ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                    System.out.print(i + " ");
            }
        }
    }
}

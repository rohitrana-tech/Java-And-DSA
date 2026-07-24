//8. Check if a number is prime or not.

package loops.level02;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prime = in.nextInt();
        boolean isPrime = true;

        if (prime <= 1) {
            isPrime = false;
        } else {
            // Optimized: Only loop up to the square root of the number
            for (int i = 2; i * i <= prime; i++) {
                if (prime % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Yes, it is a prime number");
        } else {
            System.out.println("No, it is not a prime number");
        }
    }
}

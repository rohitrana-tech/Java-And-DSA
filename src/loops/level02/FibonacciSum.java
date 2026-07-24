// 10. Print sum of first n terms of Fibonacci series.

package loops.level02;

import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 0; i <num ; i++) {
            sum = sum + first;

            int next = first + second;
            first = second;
            second = next;

        }

        System.out.println("The sum of the first " + num + " terms is: " + sum);

    }
}

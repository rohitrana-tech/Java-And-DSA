// 9. Print Fibonacci series up to n terms.

package loops.level02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 0; i <num ; i++) {
            System.out.println(first);
          int next = first + second;
            first = second;
            second = next;
        }

    }
}

// 8. Print the sum of all odd numbers upto n.

package loops.level01;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n ; i+=2) {
            sum = sum + i;
        }
        System.out.println("Sum : " +sum);
    }
}

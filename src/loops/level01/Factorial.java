// 9. Print the factorial of a given number.

package loops.level01;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int fact = 1;

        for (int i = num; i >=1 ; i--) {

            fact = fact * i;
        }
        System.out.println("Factorial :" +fact);
    }
}

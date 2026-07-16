// 7. Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

package conditional.level02;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        if(num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Both are even");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both are odd");
        } else {
            System.out.println("One is even and One is odd");
        }
    }
}

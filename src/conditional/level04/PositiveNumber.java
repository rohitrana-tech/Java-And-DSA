// 6. Take two numbers and check if both are positive and their sum is less than 100.

package conditional.level04;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        if(num1 > 0 && num2 > 0 && (num1 + num2) < 100){
            System.out.println("Both are positive and their sum is less than 100.");
        }else {
            System.out.println("Condition not met: Numbers must be positive and their sum must be less than 100.");
        }
    }
}

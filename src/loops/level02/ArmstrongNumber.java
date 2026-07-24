// 5. Check if a number is an Armstrong number.

package loops.level02;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int digits = String.valueOf(num).length();

        int original = num;

        while(num > 0){
            int rem = num % 10;
            sum += (int) Math.pow(rem, digits);

            num = num / 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        in.close();
    }
}

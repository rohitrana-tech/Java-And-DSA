//6. Check if a number is a perfect number.

package loops.level02;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
           int sum = 0;
        for(int i = 1 ; i <= num / 2; i++){
            if(num % i == 0){
                sum =sum + i;
            }

        }
        if(sum == num){
            System.out.println(sum + " is perfect number");
        }else {
            System.out.println("Not a perfect number");
        }
    }
}

// 3. Check if a number is a palindrome.

package loops.level02;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int originalNum = num ;
        int rev = 0;


        while(num > 0){
           int rem = num % 10;
           rev = (rev * 10) + rem;
           num = num / 10;

        }
        if(originalNum == rev){
            System.out.println("Number is palindrome : " +rev);
        }else {
            System.out.println("Not a palindrome : " +rev);
        }
    }
}

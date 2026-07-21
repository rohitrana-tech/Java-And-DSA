// 2. Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both.

package conditional.level04;

import java.util.Scanner;

public class Fizz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        }else{
            System.out.println("Number is not divisible by 3 , 5 and both");
        }
    }
}

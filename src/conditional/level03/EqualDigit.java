// 3. Take a 4-digit number and check if the first and last digits are equal.

package conditional.level03;

import java.util.Scanner;

public class EqualDigit {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
            int num = in.nextInt();

            if(num <1000 || num >9999){
                System.out.println("Please Enter a four digit number");
            }else{
                int firstdigit = num/1000;
                int lastdigit = num% 10;

                if(firstdigit == lastdigit){
                    System.out.println("Last and first digit are equal");
                }else {
                    System.out.println("Last and first digit are not equal");
                }
            }
    }
}

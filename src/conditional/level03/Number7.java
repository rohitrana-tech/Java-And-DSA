// 5. Check if a number is a multiple of 7 or ends with 7

package conditional.level03;

import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        
        if(num % 7 == 0){
            System.out.println("number is multiple of 7");
        } else if ( num % 10 == 7 || num % 10 == -7) {
            System.out.println("number is ends with 7 ");
        }else {
            System.out.println("number is not a multiple of 7 and number not ends with 7 ");
        }
    }
}

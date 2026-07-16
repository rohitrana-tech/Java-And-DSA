// 4. Check if one of two given numbers is a multiple of the other

package conditional.level02;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();


        if(num1 == 0 || num2 == 0){
            System.out.println("zero not accepted. please enter another number ");
        }
        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("One number is multiple of another");
        }else {
            System.out.println("Not multiple");
        }


    }
}

package conditional;

import java.util.Scanner;

// 6. Take two numbers and print the larger one.
public class Largest02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is greater");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}

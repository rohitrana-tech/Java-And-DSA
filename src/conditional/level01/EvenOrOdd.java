package conditional.level01;
// 2. Check if a number is even or odd.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        if(n % 2 == 0){
            System.out.println("Number is even ");
        }else {
            System.out.println("Number is odd");
        }
    }

}

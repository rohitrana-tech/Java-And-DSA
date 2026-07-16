package conditional.level01;
// 1. Take a number and print whether it’s positive, negative, or zero.

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        if(n == 0){
            System.out.println("Number is zero");
        }else if(n>0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }
    }
}

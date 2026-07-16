// 1. Take three sides and check if they form a valid triangle.

package conditional.level02;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter sides: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a+b>c && a+c>b && b+c>a ){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Not a valid triangle");
        }
    }
}

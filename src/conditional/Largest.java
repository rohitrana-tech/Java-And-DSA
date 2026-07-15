package conditional;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        // Q:- Find the Largest of the 3 numbers
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        if(a>=b && a>=c){
//            System.out.println("a is greatest " +a);
//        } else if (b>=a && b>=c) {
//            System.out.println("b is greatest " +b);
//
//        }else {
//            System.out.println("c is greatest " +c);
//        }



        // 2nd approach
        int max = a;
        if(b > max){
              max = b;
        }  if (c > max) {
              max = c;
        }
            System.out.println(max);

    }
}

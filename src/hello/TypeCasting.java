package hello;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
        // here in the terminal I input integer still it converted into float ex:- 67 to 67.0 .
        // It is possible because the destination type(Float) is greater than source type(Integer).


        // TypeCasting = Casting incompatible types . ex:- float to int
        // [Compressing the bigger number into smaller explicitly].

//        int num1 = (int)(464.47f);
//        System.out.println(num1);


        // Automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 90;
//
//        int d = a*c/b;
//
//        System.out.println(d);


        int number = 'A'; // Provide the output in ASCII . value :- 65
        System.out.println(number);

        // rules for automatic promotion in expression

    //    1. All the byte, short and character are promoted into Integer.
        // 2. if one operand is long then whole expression is shifted into long. ex:-
        System.out.println(3*8.6);


        byte b = 24;
        char c = 'a';
        short s = 1024;
        int i = 595995;
        float f = 12.44f;
        double d = 113.341235413125;
        double result = (f*b)+ (i / c)- (d*s);
        // float + integer -double = double
        System.out.println((f*b)+ " " + (i / c) + " " + (d*s));
        System.out.println(result);

    }
}

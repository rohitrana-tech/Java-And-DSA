// 2. If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.


package conditional.level02;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sides: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");

            if (a == b && b == c) {
                System.out.println("triangle is equilateral");
            } else if (a == b || b == c || c == a) {
                System.out.println("Triangle is Isosceles");
            } else {
                System.out.println("Triangle is Scalene");
            }

        } else {
            System.out.println("Not a valid triangle");
        }
    }
}

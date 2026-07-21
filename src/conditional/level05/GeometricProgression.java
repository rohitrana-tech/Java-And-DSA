// 6. Take three numbers and check if they are in geometric progression.
package conditional.level05;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // 1. Handle zero cases first
        if (a == 0 || b == 0 || c == 0) {
            if (a == 0 && b == 0 && c == 0) {
                System.out.println("Are in Geometric Progression.");
            } else {
                System.out.println("Are not in Geometric Progression.");
            }
        }
        // 2. Change 'if' to 'else if' to avoid double execution
        else if (b * b == a * c) {
            System.out.println("Are in Geometric Progression.");
        } else {
            System.out.println("Are not in Geometric Progression.");
        }

        in.close();
    }
}

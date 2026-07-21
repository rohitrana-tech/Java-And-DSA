// 5. Take three numbers and check if they are in arithmetic progression.

package conditional.level05;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(b-a == c-b){
            System.out.println("Are in arithmetic progression");
        }else {
            System.out.println("Not in arithmetic progression");
        }
    }
}

// 8. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.

package conditional.level02;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lowercase alphabet");
        char alpha = in.next().charAt(0);

        if (alpha >= 'A' && alpha <= 'Z') {
            System.out.println("please enter lowercase alphabet");
        } else if (alpha >= 'a' && alpha <= 'm') {
            System.out.println("belong from a to m");
        } else if (alpha >= 'n' && alpha <= 'z') {
            System.out.println("belong from n to z");
        }else {
            System.out.println("Not a valid alphabet character");
        }
    }
}

// 1. Take a character and check if it is a letter, a digit, or neither.

package conditional.level04;

import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = in.next().charAt(0);

        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ){
            System.out.println("Letter");
        } else if (ch >= '0' && ch <= '9' ) {
            System.out.println("Digit");
        }else {
            System.out.println("neither");
        }
    }
}

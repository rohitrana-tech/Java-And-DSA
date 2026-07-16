// 10. Take a character and check whether it’s uppercase, lowercase, a digit, or a special character
package conditional.level01;

import java.util.Scanner;

public class AlphabetCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");

        char ch = in.next().trim().charAt(0);

        if(ch>= 'a' && ch<='z'){
            System.out.println("Lowercase");
        }else if(ch>= 'A' && ch<='Z') {
            System.out.println("Uppercase");
        } else if(ch>='0' && ch<='9')  {
            System.out.println("A digit");
        }else{
            System.out.println("Special Character");
        }

    }
}

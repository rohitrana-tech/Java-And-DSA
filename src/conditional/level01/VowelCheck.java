package conditional.level01;
// 9. Take a character and check if it’s a vowel or consonant
import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter alphabet: ");
        char ch = in.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                System.out.println(ch + " is Vowel");
            } else {
                System.out.println(ch + " is consonant");
            }

        } else{
                System.out.println(ch + " is not a valid alphabet");
            }
        }


}

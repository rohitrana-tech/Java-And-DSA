// 8. Take a weekday number (1–7) and determine if it is a weekday or weekend

package conditional.level04;

import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num >= 1 && num<= 5){
            System.out.println("Weekday");
        } else if (num >= 6 && num <= 7) {
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid number entered");
        }
    }
}

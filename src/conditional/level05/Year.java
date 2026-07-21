// 10. Take a year and print the corresponding century (e.g., “19th century”, “20th century”)

package conditional.level05;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = in.nextInt();

        int century = ((year - 1) / 100) + 1;

        String suffix;

        // Handle the exception numbers: 11th, 12th, and 13th
        if (century % 100 >= 11 && century % 100 <= 13) {
            suffix = "th";
        } else {
            // Check the very last digit
            switch (century % 10) {
                case 1:  suffix = "st"; break;
                case 2:  suffix = "nd"; break;
                case 3:  suffix = "rd"; break;
                default: suffix = "th"; break;
            }
        }

        // 3. Print the final result
        System.out.println(century + suffix + " century");
    }
}





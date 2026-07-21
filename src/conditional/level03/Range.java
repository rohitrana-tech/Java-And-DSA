// 8. Check if a number lies within the range [100,999].

package conditional.level03;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num >= 100 && num <= 999){
            System.out.println("Number lies within the range ");
        }else{
            System.out.println("Number does not lies with in the range");
        }
    }
}

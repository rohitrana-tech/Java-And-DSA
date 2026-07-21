// 7. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.

package conditional.level03;

import java.util.Scanner;

public class AmountEvenly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int amount = in.nextInt();

        if(amount % 100 == 0){
            System.out.println("Amount can be evenly divided into 2000, 500, and 100 currency notes.");
        }else {
            System.out.println("Amount cannot be evenly divided into these notes.");
        }
    }
}

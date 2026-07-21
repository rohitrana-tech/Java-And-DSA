//  9. Take electricity units consumed and calculate the bill as per slabs (using if-else).

package conditional.level04;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();


        if(unit <= 100){
            int slab1 = unit * 4;
            System.out.println("Slab1 bill: " +slab1);
        } else if (unit <= 250) {
            int slab2 = 400 + (unit - 100)*5;
            System.out.println("Slab2 bill: " +slab2);
        } else if (unit <=400) {
            int slab3 = 400 + 750 + (unit - 250) * 6;
            System.out.println("Slab3 bill:" +slab3);

        }else {
            int slab4 = 400 + 750 + 900 + (unit - 400) * 10;
            System.out.println("Slab4 bill: " +slab4);
        }

    }
}

// 2. Take three numbers and check if they can form a Pythagorean triplet.

package conditional.level05;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

       int sq1 = num1 * num1;
       int sq2 = num2 * num2;
       int sq3 = num3 * num3;

      if(sq1 + sq2 == sq3|| sq2 + sq3 == sq1 || sq3 + sq1 == sq2){
          System.out.println("They can form a Pythagorean triplet");
      } else {
          System.out.println("they cannot form a Pythagorean triplet");
      }
    }
}

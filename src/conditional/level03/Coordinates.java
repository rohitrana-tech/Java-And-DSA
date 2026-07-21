// 6. Take coordinates (x, y) and determine which quadrant the point lies in.

package conditional.level03;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int x = in.nextInt();
       int y = in.nextInt();

       if(x > 0 && y > 0){
           System.out.println("Quadrant 1");
       } else if (x < 0 && y < 0) {
           System.out.println("Quadrant 3");
       } else if (x == 0 && y == 0) {
           System.out.println("Origin");
       } else if (x < 0 && y > 0) {
           System.out.println("Quadrant 2");
       }else {
           System.out.println("Quadrant 4");
       }

    }
}

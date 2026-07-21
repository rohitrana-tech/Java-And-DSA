// 1. Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.

package conditional.level05;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if(x == 0 && y == 0){
            System.out.println("Point lies on origin");
        } else if (x == 0 && (y > 0 || y < 0)) {
            System.out.println("Point lies on Y-axis");
        }else if( y == 0 && (x >0 || x<0)){
            System.out.println("Point lies on X-axis");
        }else {
            System.out.println("Point lies in a quadrant");
        }
    }
}

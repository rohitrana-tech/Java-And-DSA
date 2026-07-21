// 9. Take two angles of a triangle and compute the third angle.

package conditional.level03;

import java.util.Scanner;

public class TriangleAngle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();


        if(angle1 > 0 && angle2 > 0 && (angle1 + angle2) < 180){

            int angle3 = 180 - (angle1+angle2);
                System.out.println("Third angle of triangle is " +angle3);
        }else {
            System.out.println("Invalid input angles. They cannot form a triangle.");
        }
    }
}

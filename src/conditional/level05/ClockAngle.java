// 4. Take time (hours and minutes) and print the smaller angle between the hour and minute hands.

package conditional.level05;

import java.util.Scanner;

import static java.lang.Math.min;

public class ClockAngle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours = in.nextInt();
        int minutes = in.nextInt();


        if(hours == 12){
            hours = 0;
        }
        double minuteAngle = minutes * 6;
        double hourAngle = (hours * 30)+(minutes * 0.5);

        double Difference = Math.abs(hourAngle - minuteAngle);
        double smallerAngle = min(Difference, 360 - Difference);

        System.out.println(smallerAngle);

    }
}

// 5. Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “GoodEvening”, or “Good Night”.

package conditional.level02;

import java.util.Scanner;

// import static javax.print.attribute.standard.MediaSizeName.A;

public class Hours {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();

        if(time >= 5 && time < 12){
            System.out.println("Good Morning");
        } else if (time >= 12 && time < 17) {
            System.out.println("Good Afternoon");
        } else if (time >= 17 && time < 22) {
            System.out.println("Good Evening");
        }else{
            System.out.println("Good Night");
        }
    }
}

// 3. Take marks (0–100) and print the corresponding grade (A/B/C/D/F).

package conditional.level02;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks b/w 0 to 100");
        double grade = in.nextDouble();

        if(grade<0 || grade >100) {
            System.out.println("!Invalid input, marks must be between 0 - 100");
        }
           else  if(grade >= 90){
            System.out.println("A");
        } else if (grade>=75) {
            System.out.println("B");
        } else if (grade>=60) {
            System.out.println("C");
        } else if (grade >=45){
            System.out.println("D");
        }else {
            System.out.println("F");
        }


    }
}

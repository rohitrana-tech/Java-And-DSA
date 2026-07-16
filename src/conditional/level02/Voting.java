// 6. Check voting eligibility for a given age (18+).
package conditional.level02;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();

        if(age >= 18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }
}

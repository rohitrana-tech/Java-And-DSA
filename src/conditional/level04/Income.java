// 5. Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

package conditional.level04;

import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter income: ");
        int income = in.nextInt();
        System.out.println("enter age: ");
        int age = in.nextInt();

        if(age>18 && income>500000){
            System.out.println("eligible for tax");
        }else {
            System.out.println("Not eligible for tax");
        }
    }
}

package conditional.level01;
// 3. Check if a number is divisible by 5.

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

//        if(num % 5 == 0){
//            System.out.println("Number is divisible by 5");
//        }else {
//            System.out.println("Number is not divisible by 5");
//        }




       // 4. Check if a number is divisible by both 3 and 5

        if(num % 5 == 0 && num % 3 == 0){
            System.out.println("Number is divisible by 5 and 3 both");
        }else {
            System.out.println("Number is not divisible by 5 and 3 both");
           }

    }
}

// 5. Print the table of a given number (n * 1 to n * 10).

package loops.level01;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

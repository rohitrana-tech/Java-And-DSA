// 3. Take three numbers and print the median value (neither maximum nor minimum).

package conditional.level04;

import java.util.Scanner;

public class MedianValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a <= b && b <= c || c <= b && b <= a){
            System.out.println("Median value is: " +b);
        } else if((b <= a && a <= c) || (c <= a && a <= b)) {
            System.out.println("Median value is: " +a);
        }else {
            System.out.println("Median value is: " +c);
        }
    }
}

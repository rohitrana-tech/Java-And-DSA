package conditional.level01;
// 8. Take a temperature value and print "cold" , "hot", "warm" using range conditions
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature");
        float temperature = in.nextFloat();

        if(temperature <= 15){
            System.out.println("cold");
        } else if (temperature <=30) {
            System.out.println("warm");
        } else {
            System.out.println("hot ");

        }

    }
}

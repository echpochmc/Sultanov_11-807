package Homework7;
import java.util.Scanner;

public class HW7_D {
    public static int recursion(double n) {
        if (n == 1) {
            return 1;
        }
        else if (n > 1 && n < 2 ) {
            return 0;
        }
        else {
            return recursion(n / 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if (recursion(n) == 1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

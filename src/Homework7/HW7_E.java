package Homework7;
import java.util.Scanner;

public class HW7_E {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursion(n / 10);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }
}

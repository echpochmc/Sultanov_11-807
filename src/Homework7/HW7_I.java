package Homework7;
import java.util.Scanner;

public class HW7_I {
    public static void recursion(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        }
        else {
            recursion( n, ++k);
        }
    }
    public static void main(String[] atgs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n, 2);
    }
}

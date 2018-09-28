package Homework7;
import java.util.Scanner;

public class HW7_H {
    public static boolean recursion(int n, int i) {
        if (n < 1) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion(n, i + 1);
        }
            else {
                return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n, 2));
    }
}

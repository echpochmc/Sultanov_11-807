package Homework5;

import java.util.Scanner;

class Scratch_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int x = 0;
        int a = 0;
        int b;
        while (1 == 1) {

            if (x == 0) {
                a = sc.nextInt();
            }
            String op = sc.next();
            b = sc.nextInt();
            if (op.equals("+")) {
                System.out.println(a += b);
            }
            if (op.equals("-")) {
                System.out.println(a -= b);
            }
            if (op.equals("*")) {
                System.out.println(a *= b);
            }
            if (op.equals("/")) {
                System.out.println(a = a / b);
            }
            x -= 1;
            System.out.println("сбросить?");
            s = sc.next();
            if (s.equals("да")) {
                x = 0;
            }
        }
    }
}
import java.util.Scanner;

class Scratch_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        while (1 == 1) {
            System.out.println("Введите 1 число: ");
            int m = input.nextInt();
            System.out.println("Введите второе число: ");
            int n = input.nextInt();
            System.out.println("Введите действие: ");
            String op = sc.next();
            int result = 0;
            if (op.equals("+")) {
                result = m + n;
            }
            if (op.equals("-")) {
                result = m - n;
            }
            if (op.equals("/")) {
                result = m / n;
            }
            if (op.equals("*")) {
                result = m * n;
            }
            System.out.println(result);
        }
    }
}
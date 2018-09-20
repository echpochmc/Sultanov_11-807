import java.util.Scanner;

public class Homework5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String s = sc.next();
        System.out.println("Введите ключ (l - нижний регистр/u - верхний регистр):");
        String in = sc.next();
        if (in.equals("l")) {
            System.out.println(s.toLowerCase());
        }
        else {
            System.out.println(s.toUpperCase());
        }
    }
}

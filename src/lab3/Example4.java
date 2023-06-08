package lab3;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        System.out.println("Введите 2-е число");
        int b = in.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println("1 способ " + i);
            }
            while (a <= b) {
                System.out.println("2 способ " + a);
                a++;
            }
        } else {
            System.out.println("1-е число должно быть больше 2-о");
        }
    }
}

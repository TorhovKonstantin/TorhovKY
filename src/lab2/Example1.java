package lab2;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = in.nextInt();
        int b = a%3;
        System.out.println("Результат = " +b);
        if (b==0) {
            System.out.println("Введенное число делиться на 3 без остатка");
        }
        else {
            System.out.println("Введенное число не делиться на 3 без остатка");
        }
    }
}

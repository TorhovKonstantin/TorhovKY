package lab1;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z,x;
        System.out.println("Введите число");
        int a = in.nextInt();
        System.out.println("Введите число");
        int b = in.nextInt();
        z = a + b;
        x = a - b;
        System.out.println("Сумма "+z);
        System.out.println("Разность "+x);
    }
}

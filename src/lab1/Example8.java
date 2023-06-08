package lab1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = in.nextInt();
        System.out.println("Введите месяц: ");
        int month = in.nextInt();
        System.out.println("Введите год: ");
        int year = in.nextInt();
        System.out.println("Сегодня: " +day+"."+month+"."+year);
        in.close();
    }
}

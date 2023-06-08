package lab1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой возраст");
        int year = in.nextInt();
        int years;
        int a = 2023;
        years = a - year;
        System.out.println("Вы родились в " + years +" году.");
    }
}

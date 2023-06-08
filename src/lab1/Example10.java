package lab1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год рождения");
        int year = in.nextInt();
        int years;
        int a = 2023;
        years = a - year;
        System.out.println("Вам " + years +" лет");
    }
}

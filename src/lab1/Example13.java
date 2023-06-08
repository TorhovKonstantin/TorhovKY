package lab1;
import  java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int year = in.nextInt();
        System.out.println("Введите число");
        int years = in.nextInt();
        int a = year+years;
        System.out.println("При сложении получилось "+a);
    }
}

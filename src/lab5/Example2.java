package lab5;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("В рамках задачи необходимо ввести два символа");
        System.out.println("Введите первый символ");
        char firstInChar = in.next().charAt(0);
        System.out.println("Введите второй символ");
        char secondInChar = in.next().charAt(0);
        Example_2_SuppClass taskObject = new Example_2_SuppClass(firstInChar, secondInChar);
        taskObject.showListChar();
    }
}


package lab2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число которое при делении на 4 будет больше 10");
        int a = in.nextInt();
        int b = a / 4;
        if (b >= 10) {
            System.out.println("Число " + a + " подходит");
        } else
        {
            System.out.println("Число "+a+" не подходит");
        }
    }
}

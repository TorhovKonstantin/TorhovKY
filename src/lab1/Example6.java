package lab1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String firstName = in.nextLine();
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите отчество: ");
        String secondName = in.nextLine();
        System.out.println("Здравствуйте " + firstName + " " + name + " " + secondName);
        in.close();
    }
}

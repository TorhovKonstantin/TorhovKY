package lab2;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        var a = in.nextInt();
        int b = (a / 1000);
        if (b >= 1) {
            System.out.println(b + " тысяч");
        }
        else
        {
            System.out.println("Введите большее число");
        }
    }
}

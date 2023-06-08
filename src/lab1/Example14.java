package lab1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b, c, d;
        System.out.println("Введите число");
        int a = in.nextInt();
        b = a - 1;
        c = a + 1;
        d = (b + c + a) * (b + c + a);
        System.out.println("Последовательность 4 чисел " +b+", "+a+", "+c+", "+d);
    }
}

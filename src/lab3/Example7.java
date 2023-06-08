package lab3;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int s = in.nextInt();
        char a = 'a';
        char[] m = new char[s];
        for (char i=0; i<m.length; i++)
        {
            m[i] = a++;
            a++;
            System.out.println(m[i]);
        }
    }
}

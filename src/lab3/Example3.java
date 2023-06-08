package lab3;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки правила Фибоначи");
        int a = in.nextInt();
        int[] b = new int[a];
        int z = 2;
        int x = 2;
        b[0] = 0;
        b[1] = 1;
        while (z<b.length)
        {
            b[z]=b[z-1]+b[z-2];
            z++;
        }
        while (x-1<b.length)
        {
            System.out.println("while "+b[x-1]);
            x++;
        }
        for (int i=2; i<b.length; i++)
        {
            b[i]=b[i-1]+b[i-2];
        }
        for (int f=2; f<b.length; ++f)
        {
            System.out.println("for "+b[f]);
        }
    }
}

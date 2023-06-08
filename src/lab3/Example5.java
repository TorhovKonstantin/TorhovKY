package lab3;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел для их суммы");
        int a = in.nextInt();
        int b = 0;
        int c = 0;
        int s = 0;
        while (c<a)
        {
            if(b%5==2||b%3==1)
            {
                c++;
                s+=b;
                System.out.println(b+"+");
            }
            b++;
        }
        System.out.println("="+s);
    }
}

package lab3;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        char mm[] = new char[10];
        char a = 'A';
        char ml[] = {'A','E','I'};
        for (int i=0; i< mm.length; a++)
        {
            for (int q=0; q< ml.length; q++)
            {
                if (a == ml[q])
                {
                    a++;
                }
            }
            mm[i]=a;
            System.out.println("Элемент массива ["+i+"] = " +mm[i]);
            i++;
        }
    }
}

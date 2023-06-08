package lab3;
import java.util.*;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = in.nextInt();
        int[] m = new int[a];
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(100);
            System.out.println("Элементы массива ["+i+"] = "+m[i]);
        }
        Arrays.sort(m);
        System.out.println("Производим сортировку от большего числа к меньшему:");
        while (a>=1)
        {
            System.out.println(m[a-1]);
            a--;
        }
    }
}

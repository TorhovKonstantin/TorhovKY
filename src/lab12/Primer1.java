package lab12;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Primer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt();
        }

        System.out.println("Массив arr : ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEventNumbers(arr);

        System.out.println("Массив arrResult(четные числа из массива arr) : ");
        System.out.println(Arrays.toString(arrResult));
    }
    public static int[] filterEventNumbers(int[] arr){
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}

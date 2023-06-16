package lab12;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(200);
        }

        System.out.println("Массив arr");
        System.out.println(Arrays.toString(arr));

        System.out.println("Введите на какое число будем делить");
        int divideValue = in.nextInt();

        System.out.println("Массив arrResult (числа которые делятся на " + divideValue + " без остатка.)");
        int[] arrResult = filterDivideNumbers(arr,divideValue);
        System.out.println(Arrays.toString(arrResult));

    }

    public static int[] filterDivideNumbers(int[] arr, int divideValue){
        return Arrays.stream(arr)
                .filter(x -> (x % divideValue == 0))
                .toArray();
    }
}

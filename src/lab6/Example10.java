package lab6;
import java.util.Arrays;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        System.out.println("На вход подаем произвольное количество целочисленных аргументов, на выходе \n" +
                "получаем массив из двух элементов, значение наибольшего и наименого значения среди строк");
        System.out.println("Введите произвольное количество целочисленных аргументов: ");
        int[] result = getMinMax(13, 15, 26, 132, -1, 5, 20);
        System.out.println("На выходе получим: " + Arrays.toString(result));
    }

    static int[] getMinMax(int ... args){
        int[] resultArray = new int[2];
        resultArray[0] = args[0];
        resultArray[1] = args[0];
        for (int arg : args){
            if (resultArray[0] < arg) resultArray[0] = arg;
            if (resultArray[1] > arg) resultArray[1] = arg;
        }
        return resultArray;
    }
}

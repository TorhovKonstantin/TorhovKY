package lab6;
import java.util.Arrays;
public class Example8 {
    public static void main(String[] args) {
        System.out.println("В программе на вход подаем целочисленный массив, на выходе получаем среднее значение \n" +
                "для элементов всего массива");
        int[] intArray = {10, 20, 30, 40, 50};
        int taskResult = avgValueArray(intArray);
        System.out.println("На входе подали массив: " + Arrays.toString(intArray) + "\n" +
                "Cреднее значение массива равно : " + taskResult);
    }
    static int avgValueArray(int[] someArray){
        int result = 0;
        for (int arg : someArray){
            result = result + arg;
        }
        result = result / someArray.length;
        return  result;
    }
}

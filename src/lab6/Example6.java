package lab6;
import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        System.out.println("В данном задании мы создаем статистический метод, которому передается целочисленный \n" +
                "массив и число.");
        int[] taskArray = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        int taskInt = 6;
        String result = Arrays.toString(taskArray(taskArray, taskInt));
        System.out.println("Результат: " + result);
        System.out.println("Ссылка на массив: " + taskArray(taskArray, taskInt));
    }

    static int[] taskArray(int[] someArray, int someInt){
        int[] resultArray;
        if (someArray.length >= someInt){
            resultArray = new int[someInt];
            for (int i = 0; i < resultArray.length; i++){
                resultArray[i] = someArray[i];
            }
        }
        else resultArray = someArray;
        return resultArray;
    }
}

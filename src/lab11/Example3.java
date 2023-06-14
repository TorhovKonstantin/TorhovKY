package lab11;
//Создать приложение с использованием рекурсии для перевода целого числа,
//введенного с клавиатуры, в двоичную систему счисления.
import java.util.Scanner;
public class Example3 {
    static int lengthArray;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] someArray;


        System.out.println("Введите длину массива: ");
        lengthArray = in.nextInt();
        someArray = new int[lengthArray];
        someArray = addArray(lengthArray, someArray);
//        for (int valueArray : someArray){
//            System.out.println(valueArray);
//        }
        String finillyString = printArray(lengthArray, someArray);
        System.out.println("Выводим массив с помощью рекурсии: " + finillyString);
    }

    public static int[] addArray(int lengthArray, int[] someArray){
        if (lengthArray == 0) return someArray;
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Заполните значение " + lengthArray + " элемента массива: ");
            int valueArray = in.nextInt();
            someArray[lengthArray - 1] = valueArray;
            lengthArray--;

            return addArray(lengthArray, someArray);
        }
    }

    public static String printArray(int lengthArray,int[] someArray) {
        if (lengthArray == 0) return "";
        else {
            String valueForArray = String.valueOf(someArray[lengthArray - 1]);
            lengthArray--;
            String stringResult = printArray(lengthArray, someArray);
            return stringResult + " " + valueForArray;
        }
    }
}

package lab6;
import java.util.Arrays;
public class Example7 {
    public static void main(String[] args) {
        System.out.println("В данной программе на вход передаем символьный массив, на выходе получаем \n" +
                "целочисленный массив состоящий из кодов символов из массива - аргумента");
        char[] charArray = {'p', 'e', 'a', 'c', 'e'};
        int[] result = checkCodeChar(charArray);
        System.out.println("На выходе получим массив: " + Arrays.toString(result));
//        char testChar = (char) 101;
//        System.out.println(testChar);
    }

    static int[] checkCodeChar(char[] someArray){
        int[] resultArray = new int[someArray.length];
        for (int i = 0; i < resultArray.length; i++){
            resultArray[i] = (int) someArray[i];
        }

        return resultArray;
    }
}

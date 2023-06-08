package lab4;
import java.util.Random;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        int[][] mainArray = getArray();
        System.out.println("Изначальный массив:");
        printArray(mainArray);
        System.out.println("Измененый массив");
        mainArray = replaceArray(mainArray);
        printArray(mainArray);

    }
    static int[][] getArray(){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Задайте размер массива (формат: 3 5)");
        int size1 = in.nextInt();
        int size2 = in.nextInt();
        int[][] mainArray = new int[size1][size2];
        for (int i = 0; i < mainArray.length; i++){
            for (int j = 0; j < mainArray[i].length; j++){
                mainArray[i][j] = random.nextInt(20);
            }
        }
        return mainArray;
    }
    static void printArray(int[][] someArray){
        for (int i = 0; i < someArray.length; i++){
            for (int j = 0; j < someArray[i].length; j++){
                System.out.print(someArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] replaceArray (int[][] someArray){
        int widthArray = someArray.length;
        int hightArray = someArray[0].length;
        int[][] tempArray = new int[hightArray][widthArray];

        for (int i = 0; i < someArray.length; i++){
            for (int j = 0; j < someArray[i].length; j++){
                tempArray[j][i] = someArray[i][j];
            }
        }
        someArray = tempArray;
        return  someArray;
    }
}

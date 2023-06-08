package lab4;
import java.util.Random;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        int[][] mainArray = getArray();
        System.out.println("Изначальный массив: ");
        printArray(mainArray);
        System.out.println("Измененный массив: ");
        mainArray = deleteArray(mainArray);
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
        for (int[] ints : someArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    static int[][] deleteArray(int[][] someArray) {
        int deleteValueWidth, deleteValueHeight, tempWidth, tempHeight;
        int[][] tempArray = new int[someArray.length - 1][someArray[0].length - 1];
        tempHeight = 0;
        Random random = new Random();

        deleteValueHeight = random.nextInt((someArray.length));
        deleteValueWidth = random.nextInt((someArray[0].length));
        System.out.println("Удалив строку с индексом: " + deleteValueHeight + " и столбец  с индексом: " + deleteValueWidth  + ", получим:");
        for (int i = 0; i < tempArray.length; i ++) {
            if (i == deleteValueHeight) tempHeight++;
            tempWidth = 0;
            if (someArray.length == tempHeight) break;
            for (int j = 0; j < tempArray[0].length; j++){
                if (j == deleteValueWidth) {
                    if(someArray[0].length == tempWidth) break;
                    tempWidth++;
                }
                tempArray[i][j] = someArray[tempHeight][tempWidth];
                tempWidth++;
            }
            tempHeight ++;
        }
        someArray = tempArray;
        return someArray;
    }
}

package lab4;
import java.util.Random;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        String[][] mainArray = getArray();
        mainArray = snakeWay(mainArray);
    }

    static String[][] getArray(){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Задайте размер массива (формат: 3 5)");
        int size1 = in.nextInt();
        int size2 = in.nextInt();
        String[][] mainArray = new String[size1][size2];
        for (int i = 0; i < mainArray.length; i++){
            for (int j = 0; j < mainArray[i].length; j++){
                mainArray[i][j] = " ";
            }
        }
        return mainArray;
    }
    static void printArray(String[][] someArray){
        for (String[] ints : someArray) {
            for (String anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    static String[][] snakeWay(String[][] someArray){
        int tempHeight, tempWidth;
        tempHeight = someArray.length;
        tempWidth = someArray[0].length;

        for (int i = 0; i < tempHeight; i++){
            if (i % 2 == 0) {// Заполняем слева направо
                for (int j = 0; j < tempWidth; j++) {
                    System.out.println("Заполняем индекс: ["+i+"]"+"["+j+"]");
                    someArray[i][j] = "+";
                    printArray(someArray);
                }
            }
            if (i % 2 == 1){ // Заполняем справа на лево
                for ( int j = someArray[0].length-1; j >= 0;j--){
                    System.out.println("Заполняем индекс: ["+i+"]"+"["+j+"]");
                    someArray[i][j] = "+";
                    printArray(someArray);
                }

            }
        }
        System.out.println("Итоговый результат: ");
        printArray(someArray);
        return someArray;
    }
}

package lab4;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        String[][] mainArray = getArray();
        printArray(mainArray);

    }
    static String[][] getArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольника: ");
        int height = in.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int width = in.nextInt();
        String[][] mainArray = new String[height][width];
        for (int i = 0; i < mainArray.length; i++){
            for (int j = 0; j < mainArray[i].length; j++){
                mainArray[i][j] = "2";
            }
        }
        return mainArray;
    }

    static void printArray(String[][] someArray){
        int f;
        for (int i = 0; i < someArray.length; i++){
            f = 0;
            if ((i+1)/10 < 1)System.out.print("Номер строки:  " + (i+1) + " ");
            else System.out.print("Номер строки: " + (i+1) + " ");
            for (int j = 0; j < someArray[i].length; j++){
                System.out.print(someArray[i][j]);
                f++;
            }
            System.out.println(" длина строки: " + f);
        }
    }
}

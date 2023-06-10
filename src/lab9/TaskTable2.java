package lab9;
//В программе, где требуется из матрицы вывести столбец с номером, заданным с клавиатуры,
// могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	нет столбца с таким номером.
import org.w3c.dom.ranges.Range;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class TaskTable2 {
    public static void main(String[] args) throws Exception {
        String[][] someMatrix = new String[3][10];
        int someColumn = 0;
        System.out.println("Данная программа выводит номер стобца, который вам необходимо указать в следующей строке");
        System.out.println("Создаем матрицу размером 3 строки, 10 столбцов");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пожалуйста номер столбца: ");
        try {
            someColumn = in.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Ошибка, введено не целое число!");
            exitMethod();
        }
        System.out.println("Строк: " + someMatrix.length);
        System.out.println("Стобцов: " + someMatrix[0].length);

        System.out.println();
        System.out.println("Выведем изначальный массив (числа генерируются рандомно):");
        for (int i = 0; i < someMatrix.length; i++ ) {
            for (int j = 0; j < someMatrix[i].length; j++){
                Random rn = new Random();
                someMatrix[i][j] = String.valueOf(rn.nextInt(100));
            }
            System.out.println(Arrays.toString(someMatrix[i]));
        }
//        System.out.println(Arrays.deepToString(someMatrix));
        if ((someColumn == 0) | (someColumn == someMatrix[0].length )){
            throw new Exception("Не существует такого столбца");
        }
        System.out.println("Выведем интересующий нас столбец " + someColumn + ":");
        for (int i = 0; i < someMatrix.length; i++){
            System.out.println(someMatrix[i][someColumn-1]);
        }
    }

    static void exitMethod(){
        System.out.println("Программа будет завершена из за ошибки");
        System.exit(0);
    }
}

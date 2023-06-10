package lab9;
//В программе, вычисляющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры,
//могут возникать ошибки в следующих случаях:
//        –	ввод строки вместо числа;
//        –	ввод или вычисление значения за границами диапазона типа.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TaskTable3 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        Scanner in = new Scanner(System.in);
        int sizeArray = 0;
        int sumByte = 0;
        try {
            sizeArray = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено не целое число!");
            exitMethod();
        }

        byte[] someByteArray = new byte[sizeArray];
        System.out.println("Заполним массив данными, введите число от -128 до 127 (тип данных: Byte)");
        for (byte valueForArray : someByteArray){
            try {
                valueForArray = in.nextByte();
                sumByte = sumByte + (int) valueForArray;
                if ((sumByte < -128) || sumByte > 127){
                    throw new RuntimeException("Сумма элементов byte выходит за границы допустимого значения переменной");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введен не верный тип данных");
                exitMethod();
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
                exitMethod();
            }
        }

        System.out.println("Размер массива: " + sizeArray);
        System.out.println("Выводим массив: " + Arrays.toString(someByteArray));
    }
    static void exitMethod(){
        System.out.println("Программа будет завершена из за ошибки");
        System.exit(0);
    }
}

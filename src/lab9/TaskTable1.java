package lab9;
// В программе, вычисляющей среднее значение среди положительных элементов одномерного
// массива (тип элементов int), вводимого с клавиатуры, могут возникать ошибки в
// следующих случаях:
//        –	ввод строки вместо числа;
//        –	несоответствие числового типа данных;
//        –	положительные элементы отсутствуют.
import java.util.InputMismatchException;
import java.util.Scanner;
public class TaskTable1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthArray = 0; // Переменная определяющая длину массива
        int[] integerArray = new int[0]; // Создаем массив, размер которого задали ранее
        int commonNumber = 0; // Переменная в которую укладываются положительный целые числа
        int counterNumber = 0; // Счетчик положительных целых чисел
        System.out.println("Данная программа вычесляет среднее значение среди целых - положительных элементов массива");
        System.out.print("Введите длину массива: ");
        try {
            lengthArray = in.nextInt();
            integerArray = new int[lengthArray];
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка, вы пытаетесь создать массив с отрицательным размером");
            exitMethod();
        } catch (InputMismatchException e){
            System.out.println("Ошибка, введено не целое число!");
            exitMethod();
        }

        for (int i = 0; i < lengthArray; i++) { //// заполняем массив числами
            System.out.println("Введите " + i + " элемент массива.");
            try {
                integerArray[i] = in.nextInt();
                if (integerArray[i] > 0){
                    commonNumber = commonNumber + integerArray[i];
                    counterNumber = counterNumber + 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка, введено не целое число!");
                exitMethod();                break;
            }
        }

        try {
            if(counterNumber == 0){
                throw new Exception("Положительные элементы отсутствуют");
            }
            System.out.println("Среднее положительное массива равно: " + ((double) commonNumber/counterNumber));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            exitMethod();
        }
    }

    static void exitMethod(){
        System.out.println("Программа будет завершена из за ошибки");
        System.exit(0);
    }
}

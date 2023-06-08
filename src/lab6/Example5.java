package lab6;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа вычесляет сумму квадратов натуральных чисел.");
        System.out.println("Введите число для которого мы рассчитаем сумму квадратов: ");
        int inputValue = in.nextInt();
        System.out.println("Сумма квадрата натуральных чисел " + inputValue + "равна: " + summSquare(inputValue));
    }

    static int summSquare(int a){
        int result = 0;
        for (int i = 1; i <= a; i++){
            result = result + (i * i);
        }
        return result;
    }
}

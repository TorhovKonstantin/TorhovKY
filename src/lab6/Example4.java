package lab6;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вычеслим двойной факториал числа.");
        System.out.println("Введите положительное число, для которого будет производить вычесление: ");
        int inputValue = in.nextInt();

        System.out.println("Двойной факториал числа: "+ inputValue + "!! равен: " + doubleFactorial(inputValue));

    }

    static int doubleFactorial(int a){
        int result;
        result = a;
        while (a > 0){
            if(a <= 2) break;
            a = a - 2;
            result = result * a;
        }
        return result;
    }
}

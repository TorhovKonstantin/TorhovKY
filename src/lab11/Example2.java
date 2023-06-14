package lab11;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для перевода в двоичную систему счисления: ");
        int decimal = scanner.nextInt();
        String binary = intToBinary(decimal);
        System.out.printf("%d в двоичной системе счисления: %s", decimal, binary);
    }

    public static String intToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            System.out.println("на вход пришло " + decimal);
            int remainder = decimal % 2;
            System.out.println("Остаток: " + remainder);
            int quotient = decimal / 2;
            System.out.println("Частное: " + quotient);
            String partialResult = intToBinary(quotient);
            return partialResult + remainder;
        }
    }
}

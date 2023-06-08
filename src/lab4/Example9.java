package lab4;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Encrypt encrypt = new Encrypt();
        System.out.println("Введите текст для шифрования: ");
        String mainString = in.nextLine();
        System.out.println("Введите ключ: ");
        int shift = in.nextInt();

        String encryptString = encrypt.getEncryptString(mainString, shift);
        System.out.println("Зашифрованная строка: " + encryptString);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String  selectPoint = in.next();
        switch (selectPoint){
            case "y": String decryptString = encrypt.getDecryptString(encryptString, shift);
                System.out.println(decryptString);
                break;
            case "n": System.out.println("Выход из программы...");
                break;
            default:  System.out.println("Выбран не существующий вариант.");
        }
    }
}

package lab5;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {

        Example_1_SuppClass newChar = new Example_1_SuppClass();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите один символ (тип данных char): ");
        char someChar = in.next().charAt(0);

        System.out.println("Присвоем значение первого символа в предыдущей строке, нашему новому объекту 'newChar'");
        newChar.setCharField(someChar);

        System.out.println("Проверяем метод 'getCharField' который возвращает код символа: " + newChar.getCharField());
        System.out.println("А теперь выведем с помощью 3его метода символ присвоенный ранее и его код");
        newChar.printCharAndCode();

    }
}

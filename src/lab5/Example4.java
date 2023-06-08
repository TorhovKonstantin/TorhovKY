package lab5;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сначала воспользуемся конструктором в который передаем int и char.");
        System.out.println("Введете целочисленное значение");
        int intArg = in.nextInt();
        System.out.println("Введите символ: ");
        char charArg = in.next().charAt(0);
        Example_4_SuppClass charIntObject = new Example_4_SuppClass(intArg, charArg);
        System.out.println("Получим свойства объекта \"charIntObject\", значение int: " + charIntObject.getIntegerArg() +
                " значение char: " + charIntObject.getCharArg() + ".");
        System.out.println("Теперь воспользуемся конструктором в который передаем double.");
        System.out.println("Введите значение double аргумента: ");
        double doubleArg = in.nextDouble();

        Example_4_SuppClass doubleObject = new Example_4_SuppClass(doubleArg);
        System.out.println("Получим свойства объекта \"doubleObject\", значение int (учитываем только десятые и " +
                "десятиченые: " + doubleObject.getIntegerArg() + ", значение char: " + doubleObject.getCharArg());

    }
}

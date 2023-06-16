package lab10;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParserXml parserXml = new ParserXml();
        System.out.println();
        System.out.println("Основное меню (Парсинг XML): ");
        System.out.println("Нажмите '1' что бы вывести список книг");
        System.out.println("Нажмите '2' что бы добавить новую книгу");
        System.out.println("Нажмите '3' что бы найти книгу по названию или автору");
        System.out.println("Нажмите '4' что бы удалить книгу по названию");
        System.out.println("Нажмите '5' что бы закрыть программу");
        System.out.print("Выбранно: ");

        int choiceOption = in.nextInt();
        in.nextLine();

        switch (choiceOption){
            case 1:
                parserXml.printBook(parserXml.parse(), "XML");
                break;
            case 2:
                parserXml.addNewBookXml();
                break;
            case 3:
                parserXml.printBook(parserXml.findBook(parserXml.parse()), "XML с указанным автором");
                break;
            case 4:
                parserXml.deleteBook();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
}

package lab10;
//import lab10.ParserJson;

import lab10.ParserXml;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParserJson ParserJson = new ParserJson();
        System.out.println();
        System.out.println("Основное меню (Парсер JSON): ");
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
                ParserXml.printBook(ParserJson.parser(), "JSON");
                break;
            case 2:
                ParserJson.addNewBook();
                break;
            case 3:
                ParserXml.printBook(ParserXml.findBook(ParserJson.parser()), "JSON c указанным автором");
                break;
            case 4:
                ParserJson.deleteBook();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
}

package lab12;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые имеют длину больше заданного значения.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования" + "\n" );
        for (String e : strings){
            System.out.println(e);
        }

        System.out.println("Введите минимальную длину слова, которое ищем в строке: ");
        int lengthString = in.nextInt();

        List<String> stringsAfter = searchLengthStrings(strings, lengthString);
        System.out.println("\n" + "Вывод строк которые длиннее " + lengthString  + " : \n");

        for (String e : stringsAfter){
            System.out.println(e);
        }

    }

    public static List<String> searchLengthStrings(List<String> strings, int lengthString){
        return strings.stream()
                .filter(s -> s.length() > lengthString)
                .collect(Collectors.toList());
    }
}

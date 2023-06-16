package lab12;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = "Ехал Гpека чеpез pеку, видит Гpека – в pеке pак. Сунул Гpека pуку в pеку, pак за pуку " +
                "Гpеку цап! ";
        System.out.println("Оригинальная строка: ");
        System.out.println(string);
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования" + "\n" );
        for (String e : strings){
            System.out.println(e);
        }

        System.out.println("Введите подстроку которую будем искать в строке: ");
        String subString = in.nextLine();

        List<String> stringsAfter = filterInputValueStrings(strings, subString);
        System.out.println("\n" + "Вывод строк которые содержат заданную подстроку :" + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }


    }
    public static List<String> filterInputValueStrings(List<String> list,String substring){
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}

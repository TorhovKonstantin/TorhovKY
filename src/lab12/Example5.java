package lab12;
import java.util.List;
import java.util.stream.Collectors;
public class Example5 {
    public static void main(String[] args) {
        String string = "Сег0дня мы п0едем н@ м@шине номер 123, кт0р@я имеет кр@сный цвет и мног0 специ@льных функций," +
                " включ@я GPS-н@виг@цию, р@дио и Bluetooth-соединение";

        List<String> strings = List.of(string.split(" "));
        System.out.println("Выведем исходный массив сформированный из строки");
        for (String e : strings){
            System.out.println(e);
        }

        System.out.println("Сформируем новый массив, в которой войду строки без чисел и спецсимволов");
        List<String> stringsAfter = onlyLetterString(strings);
        System.out.println("\n" + "Вывод строк которые содержат только буквы :" + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }

    }

    public static List<String> onlyLetterString(List<String> strings){
        return strings.stream()
                .filter(s -> s.matches("^[а-яА-Я]+$"))
                .collect(Collectors.toList());
    }
}

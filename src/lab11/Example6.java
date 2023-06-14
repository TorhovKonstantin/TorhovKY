package lab11;
//Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ> 5.
//Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина стро-ки>5
import java.sql.PreparedStatement;
import java.util.HashMap;
public class Example6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Заполнение HashMap
        // Сочетание ноль и первый сделаны для того что бы создать
        // элементы у которых значение String было больше 5.
        map.put(0, "ноль");
        map.put(1, "первый");
        map.put(2, "два");
        map.put(3, "третий");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шестой");
        map.put(7, "семь");
        map.put(8, "восьмой");
        map.put(9, "девять");
        map.put(10, "десятый");


        String zeroKeyString = "";
        // Поиск строк с ключами больше 5 и вывод их на экран
        for (int key : map.keySet()) {
            if (key > 5) {
                System.out.println();
                System.out.println(key  + " > 5, cоответственно выводим его значение");
                System.out.println("Key = " + key + ", Value = " + map.get(key));
            }
            if (key == 0){
                zeroKeyString = printForString(map);
                System.out.println("Ключ элемента равен 0, выводим " +
                        "значение все элементов через запятую:");
                System.out.println(zeroKeyString.substring(0, zeroKeyString.length() - 2) + ".");
            }
        }


        int multipliedValue = 1;
        //Перемножить все ключи где длина строки более 5 символов
        for (int key : map.keySet()){
            int lengthValueMap = map.get(key).length();
            if (lengthValueMap > 5){
                multipliedValue = multipliedValue * key;
            }
        }
        System.out.println();
        System.out.println("Перемножили все ключи, где длина строки больше 5 и получили: " + multipliedValue);

    }

    static String printForString(HashMap<Integer, String> map){
        String result = "";
        for (int key : map.keySet())
        {
            result = result + map.get(key) + ", ";
        }
        return result;
    }
}

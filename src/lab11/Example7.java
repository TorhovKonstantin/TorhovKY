package lab11;
//В кругу стоят N человек, пронумерованных от 1 до N.
//При ведении счета по кругу вычеркивается каждый второй человек, пока не останется один.
//Составить две программы, моделирующие процесс.
//Одна из программ должна использовать класс ArrayList, а вторая — LinkedList
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите количество людей в кругу");
        int numberPeople = 100000;

        System.out.println("Посчитаем время выполнения, ArrayList с " +  numberPeople + " человек");
        long arrayListTimeFinish = arraysListCounting(numberPeople);
        System.out.println("Время выполнения " + arrayListTimeFinish + " милисекунд");
        long linkedListTimeFinish = LinkedListCounting(numberPeople);
        System.out.println("Время выполнения " + linkedListTimeFinish + " милисекунд");

    }

    public static long arraysListCounting(int numberPeople){
        ArrayList<People> peopleArrayList= new ArrayList<People>();
        People people = null;
        System.out.println("Игра в ArrayList началась...");
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberPeople; i++){
            people = new People(i);
            peopleArrayList.add(people);
        }

        while (peopleArrayList.size() > 1){
            for (int i = 0; i < peopleArrayList.size(); i++){
                if (i % 2 == 0){
                    peopleArrayList.remove(i);
                }
            }
//            System.out.println("Длина списка после выбывания равна " + peopleArrayList.size());

        }
        long endTime = System.currentTimeMillis();
        String lastPeople = String.valueOf(peopleArrayList.get(0).number);
        System.out.println("В кругу ArrayList остался человек с номером: " + lastPeople);
        return endTime - startTime;
    }

    public static long LinkedListCounting(int numberPeople) {
        LinkedList<People> peopleLinkedList = new LinkedList<People>();
        People people = null;
        System.out.println("Игра в LinkedList началась...");
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberPeople; i++) {
            people = new People(i);
            peopleLinkedList.add(people);
        }

        while (peopleLinkedList.size() > 1) {
            for (int i = 0; i < peopleLinkedList.size(); i++) {
                if (i % 2 == 0) {
                    peopleLinkedList.remove(i);
                }
            }
//            System.out.println("Длина списка после выбывания равна " + peopleLinkedList.size());

        }
        String lastPeople = String.valueOf(peopleLinkedList.get(0).number);
        System.out.println("В кругу LinkedList остался человек с номером: " + lastPeople);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}

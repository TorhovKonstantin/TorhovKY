package lab11;
//Количество элементов в коллекции: Номер вариант 1
//<номер варианта * 1 000 000>
//Количество элементов для вычисления скорости получения по индексу: <номер варианта * 1 000 000 000>
//ArrayDeque
//LinkedList
//ArrayList
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
public class Example10 {
   static int objectFromAddColection = 1000000;
    static int objectFromSearchForIndexCollection = 1000000000;
    public static void main(String[] args) {

        createArrayDeque(objectFromAddColection);
        createLinkedList(objectFromAddColection);
        createArrayList(objectFromAddColection);
        searchIndexArrayDeque(objectFromSearchForIndexCollection, (objectFromSearchForIndexCollection/2));

    }

    public static ArrayDeque<Integer> createArrayDeque(int sizeArray){
        long startTime = System.currentTimeMillis();

        ArrayDeque<Integer>  arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < sizeArray; i++){
            arrayDeque.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Время добавление " + sizeArray + " в ArrayDeque равно " + (endTime - startTime) +
                " милисекунд");
        return arrayDeque;
    }

    public static LinkedList<Integer> createLinkedList(int sizeArray){
        long startTime = System.currentTimeMillis();

        LinkedList<Integer>  linkedList = new LinkedList<>();
        for (int i = 0; i < sizeArray; i++){
            linkedList.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Время добавление " + sizeArray + " в LinkedList равно " + (endTime - startTime) +
                " милисекунд");
        return linkedList;
    }

    public static ArrayList<Integer> createArrayList(int sizeArray){
        long startTime = System.currentTimeMillis();

        ArrayList<Integer>  arrayList = new ArrayList<>();
        for (int i = 0; i < sizeArray; i++){
            arrayList.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Время добавление " + sizeArray + " в ArrayList равно " + (endTime - startTime) +
                " милисекунд");
        return arrayList;
    }

    public static ArrayDeque<Integer> searchIndexArrayDeque(int sizeArray, int searchElement){
        System.out.println("Найдем " + searchElement + " в ArrayDeque состоящем из " +  sizeArray + " элементов.");


        ArrayDeque<Integer>  arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < sizeArray; i++){
            arrayDeque.add(i);
        }
        long startTime = System.currentTimeMillis();

        arrayDeque.contains(searchElement);

        long endTime = System.currentTimeMillis();
        System.out.println("Время поисква  " + searchElement + " в ArrayDeque состоящем из " + sizeArray + " элементов" +
                " равно " + (endTime - startTime) + " милисекунд");
        return arrayDeque;
    }
}

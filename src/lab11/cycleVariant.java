package lab11;
import lab11.Primer6;

import java.util.Scanner;
public class cycleVariant {
    public static void main(String[] args) {
        Primer6 head = null;
        int sizeList = initCycleVariant();
        Primer6 headNodeList = createFromHead(sizeList);
        toString(headNodeList);
        Primer6 addFromHeadNode = AddLast(headNodeList);
        toString(addFromHeadNode);
        Primer6 addFromFooterNode = AddFirst(addFromHeadNode);
        toString(addFromFooterNode);
        Primer6 addCustomPositionNode = Insert(addFromFooterNode);
        toString(addCustomPositionNode);
        Primer6 removeLastElement = RemoveLast(addCustomPositionNode);
        toString(removeLastElement);
        Primer6 removeFirstElement = RemoveFirst(removeLastElement);
        toString(removeFirstElement);
        Primer6 removeCustomPositionNode = Remove(removeFirstElement);
        toString(removeCustomPositionNode);



    }
    // Создаем однонаправленный список с головы
    public static Primer6 createFromHead(int sizeList) {
        // Ввод с головы
        Primer6 head = null;
        for (int i = 0; i < sizeList; i++){
//            System.out.println(i);
            head = new Primer6(i, head);
        }
        return head;
    }

    static Integer initCycleVariant() {     // Определяем размер массива
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int sizeList = 0;
        try {
            sizeList = in.nextInt();
        } catch (Exception e){
            System.out.println("Ошибка: введено не число");
        }
        return sizeList;
    }

    static void toString(Primer6 headNodeList){
        String resultString = "";
        while (headNodeList != null){
            resultString = resultString + headNodeList.value + ", ";
            headNodeList = headNodeList.next;
        }
        System.out.println(resultString.substring(0, resultString.length() - 2) + ".");
    }

    static Primer6 AddFirst(Primer6 HeadNodeList){
        Scanner in = new Scanner(System.in);
        System.out.println("Добавим новый элемент в начало списка");
        System.out.println("Введите значение для нового элемента в списке: ");
        int newValueForNode = in.nextInt();
        Primer6 newNode = new Primer6(newValueForNode, HeadNodeList);

        return newNode;
    }

    static Primer6 AddLast(Primer6 headNodeList){
        Scanner in = new Scanner(System.in);
        System.out.println("Добавим новый элемент в конец списка");
        System.out.println("Введите значение для нового элемента в списке: ");
        int newValueForNode = in.nextInt();
        Primer6 newNode = new Primer6(newValueForNode, null);
        Primer6 head = headNodeList;
        while (headNodeList.next != null){
            headNodeList = headNodeList.next;
        }
        headNodeList.next = newNode;


        return head;
    }

    static Primer6 Insert(Primer6 nodeList){
        Scanner in = new Scanner(System.in);
        int sizeList = numberFromList(nodeList);
        System.out.println("Введите на какую позицию вставить новый элемент от 0 до " + sizeList);
        int numberPosition = in.nextInt();
        System.out.println("Введите значения для переменной которую вставляем:");
        int newValueForNode = in.nextInt();
        Primer6 head = nodeList;
        int k = 1;

        while ((nodeList.next != null) && (k < (numberPosition - 1) )){
            nodeList = nodeList.next;
            k++;
        }
        Primer6 newNode = new Primer6(newValueForNode, null);

        newNode.next = nodeList.next.next;

        nodeList.next = newNode;

        nodeList = head;
        return nodeList;
    }

    static int numberFromList(Primer6 nodeList){
        int i = 0;

        while (nodeList.next != null){
            i++;
            nodeList = nodeList.next;
        }

        return i;
    }

    public static Primer6 RemoveLast(Primer6 nodeList){
        Primer6 head = nodeList;
        System.out.println("Удаление последнего элемента в спике: ");

        while (nodeList.next.next != null){
            nodeList = nodeList.next;
        }

        nodeList.next = null;
        nodeList = head;
        return nodeList;
    }

    public static Primer6 RemoveFirst(Primer6 nodeList){
        System.out.println("Удаление первого элемента в списке");
        nodeList = nodeList.next;
        return nodeList;
    }

    public static Primer6 Remove(Primer6 nodeList){
        Scanner in = new Scanner(System.in);
        int sizeList = numberFromList(nodeList);
        System.out.println("Введите номер элемент который будем удалять из списка от 0 до " + sizeList);
        int numberPosition = in.nextInt();
        Primer6 head = nodeList;
        int k = 1;

        while ((nodeList.next != null) && (k < numberPosition)){
            nodeList = nodeList.next;
            k++;
        }

        nodeList.next = nodeList.next.next;

        nodeList = head;

        return nodeList;
    }
}

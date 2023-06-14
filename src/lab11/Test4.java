package lab11;
// Добавление нового элемента в список в указанное место
public class Test4 {
    public static void main(String[] args) {
        Primer6 head = null;

        // Создадим начальное значение с сылкой на голову
        // Создадим линейный односвязный список
        for (int i = 5; i >= 0; i--){
            head = new Primer6(i, head);
        }
        // Выведем начальный односвязаный список
        Primer6 ref = head;
        System.out.println("Выведем изначальный список: ");
        while (ref.next != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }

        // создается новый элемент со значением 44 - для вставки
        Primer6 newNode = new Primer6(44, null);

        ref = head; // используем временную переменную
        int k = 1; // счетчик элементов
        while (ref.next != null && (k<2)){
            ref = ref.next;
            k++;
        }

        // переброска ссылок при вставке элемента
        newNode.next = ref.next.next;
        ref.next = newNode;

        ref = head; // возвращаемся в начало
        System.out.println("Выведем список после добавления нового элемента");
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}

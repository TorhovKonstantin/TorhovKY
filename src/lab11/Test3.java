package lab11;

public class Test3 {
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
        // создаем новый элемент со значением 123 - будующий хвост
        Primer6 newtail = new Primer6(123, null);


        //         указателю последнего элемента присваиваем новый "хвост" (элемент)
        ref.next = newtail;
        ref = head; // возвращаемся в начало
        System.out.println("Выведем список после добавления нового элемента");
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }

    }
}

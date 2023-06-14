package lab11;

public class Test5 {
    public static void main(String[] args) {
        Primer6 head = null;

        // Создадим начальное значение с сылкой на голову
        // Создадим линейный односвязный список
        for (int i = 5; i >= 0; i--) {
            head = new Primer6(i, head);
        }

        // Выведем начальный односвязаный список
        Primer6 ref = head;
        System.out.println("Выведем изначальный список: ");
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
        ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        ref = head;
        System.out.println("Выведем итоговый список: ");
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}

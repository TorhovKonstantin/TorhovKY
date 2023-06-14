package lab11;
// Демонстрация создания линейного однонаправленного списка
// с головы

public class Test2 {
    public static void main(String[] args) {
        // добавление элементов с перемещением головы (наращивание с головы)
        Primer6 head = null; // начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--){
            head =  new Primer6(i, head);
        }

        // Вывод элементов на экран
        Primer6 ref = head;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}

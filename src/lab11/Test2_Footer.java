package lab11;
// Демонстрация создания линейного однонаправленного списка
// с хвоста
public class Test2_Footer {
    public static void main(String[] args) {
        // добавление элементов с перемещением хвоста (отпускаемся с верхушки вниз)
        Primer6 footer = null; // начальное значение ссылки на голову
        for (int i = 0; i <= 9; i++){
            footer =  new Primer6(i, footer);
        }

        // Вывод элементов на экран
        Primer6 ref = footer; // вспомогательная переменная
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}

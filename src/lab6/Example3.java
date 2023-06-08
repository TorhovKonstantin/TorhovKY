package lab6;

public class Example3 {
    public static void main(String[] args) {

        System.out.println("Вызовем статический и передадим в него не определенное количиство целочисленных значений");
        Example_3_SuppClass.calcIntArg(13, 15, 26, 132, 12, 5, 20);
//        Example_3_SuppClass.calcIntArg(3); // Проверяем передау одного целочисленного аргумента
//        Example_3_SuppClass.calcIntArg(); // Проверяем работу вызова "пустого" метода
        System.out.println("Максимальное значение: " + Example_3_SuppClass.max);
        System.out.println("Минимальное значение: " + Example_3_SuppClass.min);
        System.out.println("Среднее значение: " + String.format("%.2f", Example_3_SuppClass.average));

        System.out.println();
        System.out.println("Вызовем функцию в которую передается целочисленный массив");
        int[] someArray = {1, 3, 4, 5, 6, 10};
        Example_3_SuppClass.calcArrayIntArg(someArray);
        System.out.println("Максимальное значение: " + Example_3_SuppClass.max);
        System.out.println("Минимальное значение: " + Example_3_SuppClass.min);
        System.out.println("Среднее значение: " + String.format("%.2f", Example_3_SuppClass.average));
    }
}

package lab5;

public class Example6 {
    public static void main(String[] args) {
        System.out.println("Создадим пустой объект");
        Example_6_SuppClass someClass = new Example_6_SuppClass();
        System.out.println("Присвоем ему 2 значения: 15 и 19 c помощью функции");
        someClass.setValue(15, 19);
        System.out.println("Проверим max(с помощью функции getMax()): " + someClass.getMax() + "" +
                " , проверим min(с помощью функции getMin(): " + someClass.getMin());
        System.out.println("Проверим работу функции присвоения значенния с одной переменной setValue(): ");
        someClass.setValue(5);
        System.out.println("Выведем значение с помощью функции printAllValues():");
        someClass.printAllValues();
        System.out.println("Присвоем значение еще ниже ранее присвоенного с помощью ф-ии setValue: ");
        someClass.setValue(3);
        System.out.println("Выведем результат в консоль: ");
        someClass.printAllValues();
    }
}

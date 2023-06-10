package lab7.Example3;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Создаем объект суперкласс с помощью конструктора с значением '3' и выведем его");
        SuperClassTest superClassObject = new SuperClassTest(3);
        System.out.println(superClassObject.toString());
        System.out.println();


        System.out.println("Проверяем работу метода для присваивания значения полю, изменим поле на 5 и выведем его");
        superClassObject.setOpenValue(5);
        System.out.println(superClassObject.toString());
        System.out.println();

        System.out.println("Создаем объект подкласса суперкласса с  числовым значением '10' и символьным 'A' и выведем его");
        SubClassTest subClassTest = new SubClassTest(10, 'A');
        System.out.println(subClassTest.toString());
        System.out.println();

        System.out.println("Проверяем работу метода по присваиванию значений объекту сабкласса и выводим его ");
        subClassTest.setOpenValue(20, 'L');
        System.out.println(subClassTest.toString());
        System.out.println();

        System.out.println("Создаем объект подкласса подкласса с  числовым значением '100' и символьным 'F' " +
                " строковым 'Мир' и выведем его");
        DoubleSubClassTest doubleSubClassObject = new DoubleSubClassTest(100, 'F', "Мир");
        System.out.println(doubleSubClassObject.toString());
        System.out.println();

        System.out.println("Проверяем работу метода по присваиванию значений объекту сабкласса и выводим его ");
        doubleSubClassObject.setOpenValue(200, 'N', "жвачка");
        System.out.println(doubleSubClassObject.toString());
        System.out.println();

    }
}

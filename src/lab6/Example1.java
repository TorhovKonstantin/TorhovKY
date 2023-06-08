package lab6;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Создадим объект, и с помощью перегруженного метода присвоим ему значения");
        Example_1_SuppClass someClass = new Example_1_SuppClass();
        System.out.println("Для начала заполним переменную с символьным полем");
        char l = 'T';
        someClass.setValue(l);
        someClass.printValue();

        System.out.println("Теперь присвоим значение текстовой переменной");
        String thisIsString = "Happy new Year?";
        someClass.setValue(thisIsString);
        someClass.printValue();

        System.out.println("Передадим в метод символьный массив из 1 елемента," +
                " и проверим что изменилась символьная переменная");
        char[] firstArray = {'D'};
        someClass.setValue(firstArray);
        someClass.printValue();

        System.out.println("Передадим в метод символьный массив");
        char[] secondArray = {'p', 'e', 'a', 'c', 'e'};
        someClass.setValue(secondArray);
        someClass.printValue();
    }
}

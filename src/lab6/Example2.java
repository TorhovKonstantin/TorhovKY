package lab6;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Вызовем метод 'oneIteration' у класса 'Example_2_SuppClass'");
        Example_2_SuppClass.oneIteration();
        System.out.println("Вызовем метод 'oneIteration' второй раз у класса 'Example_2_SuppClass'");
        Example_2_SuppClass.oneIteration();
        System.out.println("Как видим с каждым вызовом функции значение закрытого статического приватного поля \n" +
                "увеличивается на 1.");
    }
}

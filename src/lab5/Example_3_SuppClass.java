package lab5;

public class Example_3_SuppClass {
    int firstArgument;
    int secondArgument;

    public Example_3_SuppClass() {
        System.out.println("Создаем объект без аргументов");
    }

    public Example_3_SuppClass(int firstArgument) {
        this.firstArgument = firstArgument;
        System.out.println("Создаем объект с одним аргументом: " + firstArgument);
    }

    public Example_3_SuppClass(int firstArgument, int secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        System.out.println("Создаем объект с двумя аргументами: " + firstArgument + " и " + secondArgument);
    }
}

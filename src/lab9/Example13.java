package lab9;

public class Example13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массива = " + l);

            int h = 10 / l; // вызываем ошибка деление на ноль
            args[l + 1] = "10"; // вызываем ошибку Индекса не существует
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}

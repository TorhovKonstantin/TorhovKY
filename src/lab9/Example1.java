package lab9;

public class Example1 {
    // Генерируем и перехватываем ошибку
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка"); // генерируем ошибку
        } catch (RuntimeException e) { //исключение перехвачено
            System.out.println("1 " + e);// исключение обработано
        }
        System.out.println("2");
    }
}

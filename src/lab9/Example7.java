package lab9;
// Программа не запустится. т.к. нельзя перехватывать исключение с помощью чужого catch, даже если перехватчик подходит
public class Example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
//            throw new ArithmeticException(); // закоментировано что бы приложение запускалось
        } catch (ArithmeticException e)
        {
            System.out.println("2");
        }
        System.out.println("3");
    }
}

package lab9;

public class Example3 {
    // Перехватываем исключение подходящего класса RuntimeException и выводим в консоль 2
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Ошибка");
        } catch (NullPointerException e){
            System.out.println("1");
        } catch (RuntimeException e){
            System.out.println("2");
        } catch (Exception e){
            System.out.println("3");
        }
        System.out.println("4");
    }
}

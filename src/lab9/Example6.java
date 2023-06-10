package lab9;
//        Последовательность перехвата должна соответствовать иерархии классов исключений. Предок не должен
//        перехватывать исключения раньше потомков. Указанный пример выдает ошибку компилятора.
//        Программу запустить невозможно.
public class Example6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        }
//    catch (Exception e) {
//        System.out.println("2");     // Закоментировано что бы не возникало исключений.
//    }
        catch (RuntimeException  e){
            System.out.println("3");
        }
        System.out.println("4");

    }
}

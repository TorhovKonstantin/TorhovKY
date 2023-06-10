package lab9;
// Генерация исключительной ситуации в методе и дополнительное использование оператора return
// Программы выведет 55 после вывода исключений

public class Example9 {
    public static int m() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}

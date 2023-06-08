package lab5;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Воспользуемся методом, которому присваивается целочисленное значение.");
        System.out.println("Введите целочисленное значение в консоль: ");
        int inInt = in.nextInt();
        Example_5_SuppClass someClass = new Example_5_SuppClass();
        System.out.println("Создали объект \"someClass\", теперь присвоем ему значение c помощью сеттера");
        someClass.setClosedInt(inInt);
        System.out.println("Передали объекту, значение " + inInt + " получим теперь его: ");
        System.out.println(someClass.getClosedInt());
        System.out.println("Вызовем сеттер, но не будем присваивать ему ни какого значения, посмотрим что выйдет:");
        someClass.setClosedInt();
        System.out.println("Посмотрим что получили: " + someClass.getClosedInt());
        System.out.println("");
    }

}

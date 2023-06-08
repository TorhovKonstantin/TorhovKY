package lab2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        var a = in.nextInt();
        var b = a%5==2 && a%7==1;
        if (b){
            System.out.println("Число " +a+ " подходит");
        }
        else {
            System.out.println("Число "+a+" не подходит");
        }
    }
}

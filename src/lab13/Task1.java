package lab13;
class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread (String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }

    public void run() {
        try {
            System.out.println(name + ": ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}
public class Task1 {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        NewThread ob3 = new NewThread("Три");
        NewThread ob4 = new NewThread("Четыре");
        NewThread ob5 = new NewThread("Пять");
        NewThread ob6 = new NewThread("Шесть");
        NewThread ob7 = new NewThread("Семь");
        NewThread ob8 = new NewThread("Восемь");
        NewThread ob9 = new NewThread("Девять");
        NewThread ob10 = new NewThread("Десять");

        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
            ob4.t.join();
            ob5.t.join();
            ob6.t.join();
            ob7.t.join();
            ob8.t.join();
            ob9.t.join();
            ob10.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
    }
}

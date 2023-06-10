package lab7.Example2;

public class Example2 {
    public static void main(String[] args) {
        SuperClassTest superClassObject = new SuperClassTest("Передал в конструктор суперкласса");
        System.out.println(superClassObject.toString());
        SubClassTest subClassObject = new SubClassTest("Передал в конструктор сабкласса", 5);
        System.out.println(subClassObject.toString());
        System.out.println("Вызовем переопределенный метод сабкласса для присвоения с строковым параметром:");
        subClassObject.setValue("передали новую строку");
        System.out.println(subClassObject.toString());
        System.out.println("Вызовем переопределенный метод сабкласса для присвоения с целочисленным параметром:");
        subClassObject.setValue(15);
        System.out.println(subClassObject.toString());
        System.out.println("Вызовем переопределенный метод сабкласса с обоими параметрами:");
        subClassObject.setValue("передали саб классу оба параметра",15);
        System.out.println(subClassObject.toString());
    }
}

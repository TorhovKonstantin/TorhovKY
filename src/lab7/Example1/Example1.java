package lab7.Example1;

public class Example1 {
    public static void main(String[] args) {
        SuperClassTest superClassObject =
                new SuperClassTest("Передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClassTest subClassObject1 =
                new SubClassTest("Передал в конструктор подкласа");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        SubClassTest subClassObject2 =
                new SubClassTest("Передал в конструктор подкласа", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

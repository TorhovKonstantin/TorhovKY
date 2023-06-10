package lab7.Example5;

public class Example5 {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass("Какой-то текстовый параметр");
        System.out.println(superClassObject.infoValues());

        FirstSubClass firstSubObject = new FirstSubClass("Какой-то текстовый параметр первого саб класса",
                10);
        System.out.println(firstSubObject.infoValues());

        SecondSubClass secondSubObject = new SecondSubClass("Какой-то текстовый параметр второго " +
                "саб класса",'A');
        System.out.println(secondSubObject.infoValues());

//        String testSuper = superClassObject.infoValues();
//        String testFirstSub = firstSubObject.infoValues();
//        String testSecondSub = secondSubObject.infoValues();
//        System.out.println(testSuper);
//        System.out.println(testFirstSub);
//        System.out.println(testSecondSub);
        SuperClass lastObject = new FirstSubClass("Зачем это?", 777);
        System.out.println(lastObject.infoValues());
    }
}

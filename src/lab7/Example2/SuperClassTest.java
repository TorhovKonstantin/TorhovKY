package lab7.Example2;

public class SuperClassTest {
    // Приватное текстовое поле
    private String str1;
    // Свойство которое возвращает только длину строки.
    public int lengthStr1;

    // Конструктор который принимает один текстовый параметр
    public SuperClassTest(String strEx) {
        this.str1 = strEx;
        this.lengthStr1 = strEx.length();  // ??думаю что реализовано как то не правильно
    }

    public SuperClassTest() {
    }

    // Метод для присваивания значению полю
    public void setValue(String str1) {
        this.str1 = str1;
        this.lengthStr1 = str1.length(); // ??думаю что реализовано как то не правильно
    }

    public void setValue() { }

    // Перегрузим метод toString что бы можно было продемонстрировать работу
    // кода.
    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super"  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str1 = " + this.getStr1() + "\n" +
                " length str1 = " + this.lengthStr1 + " symbols";
        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }
}

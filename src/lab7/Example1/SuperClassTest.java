package lab7.Example1;

public class SuperClassTest {
    // Закрытое текстовое поле
    private String str1;

    // конструктор с текстовым аргументом

    public SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    public SuperClassTest() {
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}

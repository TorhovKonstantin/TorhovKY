package lab7.Example1;

public class SubClassTest extends SuperClassTest {
    private String str2;
    private String str3;

    // Конструктор с одним параметром
    SubClassTest(String strEx){
        super(strEx);
    }

    public SubClassTest(String strEx2, String strEx3) {
        this.str2 = strEx2;
        this.str3 = strEx3;
    }

    //@Override - антонация указываемая для того,
    // что бы показать что далее мы собираемся
    // переодпределить методм суперкласса

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str1 = " + this.getStr1() + "\n" +
                " str2 = " + this.getStr2() + "\n" +
                " str3 = " + this.getStr3();
        return ClassNameAndFieldValue;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr3() {
        return str3;


    }
}

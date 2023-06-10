package lab7.Example2;

public class SubClassTest extends SuperClassTest {
    public int int1;

    // Конструктор с двумя параметрами
    public SubClassTest(String strEx, int intEx) {
        super(strEx);
        this.int1 = intEx;
    }

    // перегрузка метода для присваивания значения без параметров
    public void setValue() {
        super.setValue();
    }

    // перегрузка метод для присваиваиня значения с одним параметром
    public void setValue(String someString){
        super.setValue(someString);
    }

    // перегрузка метод для присваиваиня значения с двумя параметрами
    public void setValue(String someString, int someInteger){
        super.setValue(someString);
        this.int1 = someInteger;
    }
    // перегрузка метод для присваиваиня значения с двумя параметрами
    public void setValue(int someInteger){
        this.int1 = someInteger;
    }
    // Перегрузим метод toString что бы можно было продемонстрировать работу
    // кода.
    @Override
    public String toString(){
        String subClassNameAndFieldValue;
        subClassNameAndFieldValue = "sub"  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str1 = " + this.getStr1() + "\n" +
                " length str1 = " + this.lengthStr1 + " symbols " + "\n" +
                " int = " + this.int1;
        return subClassNameAndFieldValue;
    }

    public void setInt1(int intX) {
        this.int1 = intX;
    }
}

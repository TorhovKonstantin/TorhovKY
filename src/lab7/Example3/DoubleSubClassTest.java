package lab7.Example3;

public class DoubleSubClassTest extends SubClassTest {

    public String openString;

    public void setOpenValue(int openIntegerX, char openCharX, String openStringX){
        super.setOpenValue(openIntegerX, openCharX);
        this.openString = openStringX;
    }

    public DoubleSubClassTest(int openIntegerX, char openCharX, String openStringX) {
        super(openIntegerX, openCharX);
        this.openString = openStringX;
    }

    @Override
    public String toString(){
        String doubleSubClassNameAndFieldValue;
        doubleSubClassNameAndFieldValue = "doubleSub"  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " openInteger = " + this.openInteger + "\n" +
                " openChar = " + this.openChar + "\n" +
                " openString = " + this.openString;
        return doubleSubClassNameAndFieldValue;
    }
}

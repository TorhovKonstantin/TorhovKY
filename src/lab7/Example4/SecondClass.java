package lab7.Example4;

public class SecondClass extends FirstClass {
    String openString;

    public SecondClass(char openCharX, String openStringX) {
        super(openCharX);
        this.openString = openStringX;
    }

    public SecondClass(SecondClass copyObject) {
        super(copyObject);
        this.openString = copyObject.openString;
    }

    @Override
    public String toString(){
        String SecondClassNameAndFieldValue;
        SecondClassNameAndFieldValue = "sub: "  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " openChar = " + this.openChar + "\n" +
                " openString = " + this.openString;
        return SecondClassNameAndFieldValue;
    }
}

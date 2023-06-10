package lab7.Example4;

public class ThirdClass extends SecondClass {
    int openInt;

    public ThirdClass(char openCharX, String openStringX, int openIntX) {
        super(openCharX, openStringX);
        this.openInt = openIntX;
    }

    public ThirdClass(ThirdClass copyObject) {
        super(copyObject);
        this.openInt = copyObject.openInt;
    }
    @Override
    public String toString(){
        String SecondClassNameAndFieldValue;
        SecondClassNameAndFieldValue = "sub from sub: "  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " openChar = " + this.openChar + "\n" +
                " openString = " + this.openString + "\n" +
                " openInt = " + this.openInt;
        return SecondClassNameAndFieldValue;
    }
}

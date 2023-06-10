package lab7.Example4;

public class FirstClass {
    char openChar;

    public FirstClass(char openCharX) {
        this.openChar = openCharX;
    }

    public FirstClass(FirstClass copyChar){
        openChar = copyChar.openChar;
    }

    @Override
    public String toString(){
        String FirstClassNameAndFieldValue;
        FirstClassNameAndFieldValue = "super: "  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " openChar = " + this.openChar;
        return FirstClassNameAndFieldValue;
    }
}

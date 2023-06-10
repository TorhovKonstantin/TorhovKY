package lab7.Example5;

public class SecondSubClass extends SuperClass {
    protected char protectedChar;

    public SecondSubClass(String protectedString, char protectedChar) {
        super(protectedString);
        this.protectedChar = protectedChar;
    }

    public String infoValues(){
        String SecondSubClassNameAndFieldValue;
        SecondSubClassNameAndFieldValue = "Second Sub class: "  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " protectedString = " + this.protectedString + "\n" +
                " protectedChar = "  + this.protectedChar;
        return SecondSubClassNameAndFieldValue;
    }
}

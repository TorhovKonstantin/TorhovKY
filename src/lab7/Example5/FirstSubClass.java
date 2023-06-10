package lab7.Example5;

public class FirstSubClass extends SuperClass {
    protected int protectedInt;

    public FirstSubClass(String protectedString, int protectedInt) {
        super(protectedString);
        this.protectedInt = protectedInt;
    }

    public String infoValues(){
        String FirstSubClassNameAndFieldValue;
        FirstSubClassNameAndFieldValue = "First Sub class: "  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " protectedString = " + this.protectedString + "\n" +
                " protectedInt = "  + this.protectedInt;
        return FirstSubClassNameAndFieldValue;
    }
}

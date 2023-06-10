package lab7.Example5;

public class SuperClass {
    protected String protectedString;

    public SuperClass(String protectedString) {
        this.protectedString = protectedString;
    }

    public String infoValues(){
        String FirstClassNameAndFieldValue;
        FirstClassNameAndFieldValue = "super: "  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " protectedString = " + this.protectedString;
        return FirstClassNameAndFieldValue;
    }
}

package lab7.Example3;

public class SuperClassTest {
    public int openInteger;

    public void setOpenValue(int openIntegerX) {
        this.openInteger = openIntegerX;
    }

    public SuperClassTest(int openIntegerX) {
        this.openInteger = openIntegerX;
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super"  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " openInteger = " + this.openInteger;
        return superClassNameAndFieldValue;
    }

}

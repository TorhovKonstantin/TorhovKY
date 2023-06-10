package lab7.Example3;

public class SubClassTest extends SuperClassTest {
        public char openChar;

        public void setOpenValue(int openIntegerX, char openCharX ) {
            super.setOpenValue(openIntegerX);
            this.openChar = openCharX;
        }

        public SubClassTest(int openIntegerX, char openChar) {
            super(openIntegerX);
            this.openChar = openChar;
        }

        @Override
        public String toString(){
            String subClassNameAndFieldValue;
            subClassNameAndFieldValue = "sub"  + "\n" +
                    " Class name: " + this.getClass().getSimpleName() + "\n" +
                    " openInteger = " + this.openInteger + "\n" +
                    " openChar = " + this.openChar;
            return subClassNameAndFieldValue;
        }
}

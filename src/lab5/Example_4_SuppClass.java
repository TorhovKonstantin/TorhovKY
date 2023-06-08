package lab5;
import java.util.Arrays;
import java.util.Scanner;
public class Example_4_SuppClass {
    int integerArg;
    char charArg;
    double doubleArg;


    public Example_4_SuppClass(int integerArg, char charArg) {
        this.integerArg = integerArg;
        this.charArg = charArg;
    }

    public Example_4_SuppClass(double doubleArg) {
        this.doubleArg = doubleArg;

        String[] tempValue = String.valueOf(doubleArg).split("[.]");
        charArg = (char) Integer.parseInt(tempValue[0]);
        integerArg = Integer.parseInt(tempValue[1].substring(0,2));
    }

    public int getIntegerArg() {
        return integerArg;
    }

    public char getCharArg() {
        return charArg;
    }
}

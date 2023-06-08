package lab6;

public class Example_1_SuppClass {
    char someChar;
    String someString;

    void setValue(char someChar) {
        this.someChar = someChar;
    }

    void setValue(String someString) {
        this.someString = someString;
    }

    void setValue(char [] someArray){
        if (someArray.length == 1){
            this.someChar = someArray[0];
        }
        else {
            this.someString = String.valueOf(someArray);
        }
    }

    void printValue(){
        System.out.println("Значение переменной someChar: " + someChar);
        System.out.println("Значение переменной someString: " + someString);
    }
}

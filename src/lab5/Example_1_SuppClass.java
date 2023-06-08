package lab5;

public class Example_1_SuppClass {
    private char charField;

    //Setter
    public void setCharField(char newCharField){
        this.charField = newCharField;
    }

    //Getter
    public char getCharField(){
        return charField;
    }

    //Return Symbol and Symbol code
    public void printCharAndCode(){
        System.out.println("Поле содержит символ: " + charField + " и код этого символа: " + (int)charField);
    }
}

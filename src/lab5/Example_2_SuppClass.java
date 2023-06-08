package lab5;

public class Example_2_SuppClass {
    private char firstChar, secondChar;

    public Example_2_SuppClass(char firstChar, char secondChar) {
        this.firstChar = firstChar;
        this.secondChar = secondChar;
    }

    public void showListChar(){
        char tempArg = 0;
        if ((int) firstChar > (int) secondChar){
            firstChar = tempArg;
            firstChar = secondChar;
            secondChar = tempArg;
        }
        System.out.println("Выведем все символы из кодовой таблицы между " + firstChar + " и " + secondChar + ":");
        for (int i = (int) firstChar; i <= (int) secondChar; i++){
            System.out.print((char) i + " ");
        }
    }
}

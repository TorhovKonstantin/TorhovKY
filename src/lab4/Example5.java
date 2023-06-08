package lab4;

public class Example5 {
    public static void main(String[] args) {
        String[][] mainArray = getArray();
        printArray(mainArray);

    }

    static String[][] getArray() {
        int width, height, tempValue;
        height = 6;
        width = 7;
        tempValue = 0;
        String[][] mainArray = new String[height][width];
        for (int i = 0; i < mainArray.length; i++) {
            tempValue = tempValue + 1;
            for (int j = 0; j < mainArray[i].length; j++) {
                if (j == 0) mainArray[i][j] = "2";
                else if (j == tempValue) mainArray[i][j] = "2";
                else if (i == 5) mainArray[i][j] = "2";
                else mainArray[i][j] = " ";

            }
        }
        return mainArray;
    }
    static void printArray(String[][] someArray){
        int f;
        for (int i = 0; i < someArray.length; i++){
            f = 0;
            if ((i+1)/10 < 1)System.out.print("Номер строки:  " + (i+1) + " ");
            else System.out.print("Номер строки: " + (i+1) + " ");
            for (int j = 0; j < someArray[i].length; j++){
                System.out.print(someArray[i][j]);
                f++;
            }
            System.out.println(" длина строки: " + f);
        }
    }
}

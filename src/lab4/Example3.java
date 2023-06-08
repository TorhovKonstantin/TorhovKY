package lab4;

public class Example3 {
    public static void main(String[] args) {
        int width, height, tempValue;
        height = 6;
        width = 7;
        tempValue = 0;
        for (int i = 1; i <= height; i++){
            System.out.print("Номер строки:  " + i + " ");
            tempValue = tempValue + 1;
            for (int j = 1; j <= width; j++){
                if (j == 1) System.out.print("|");
                if (i == height & j != 1 &  j < tempValue+1) System.out.print("_");
                if (j == tempValue) System.out.print("\\");
                if (i != 6) System.out.print(" ");
            }
            System.out.println();
        }
    }
}

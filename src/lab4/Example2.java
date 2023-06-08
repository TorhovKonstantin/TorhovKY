package lab4;

public class Example2 {
    public static void main(String[] args) {
        int width, height, numSym;
        width = 23;
        height = 11;
        for (int i = 1; i <= height; i++){
            if (i / 10 != 1) {
                System.out.print("Номер строки:  " + i + " ");
            }
            else System.out.print("Номер строки: " + i + " ");
            numSym = 0;
            for (int j = 1; j <= width; j++){
                System.out.print("+");
                numSym = numSym + 1;
            }
            System.out.println(" Количество символов в строке: " + numSym);
        }
    }
}

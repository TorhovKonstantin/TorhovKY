package lab6;

public class Example_3_SuppClass {
    static int max, min;
    static double average;
    static void calcIntArg(int ... args){
        int tempCounter = 0;
        if (args.length == 0) return;
        max = args[0];
        min = args[0];
        for (int arg : args) {
            if (arg > max) max = arg;
            if (arg < min) min = arg;
            average = average + arg;
            tempCounter++;
        }
        average = average/tempCounter;
    }

    static void calcArrayIntArg(int[] someArray){
        int tempCounter = 0;
        if (someArray.length == 0) return;
        max = someArray[0];
        min = someArray[0];
        for (int arg : someArray){
            if (arg > max) max = arg;
            if (arg < min) min = arg;
            average = average + arg;
            tempCounter++;
        }
        average = average / tempCounter;
    }
}

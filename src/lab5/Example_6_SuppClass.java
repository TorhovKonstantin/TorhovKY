package lab5;

public class Example_6_SuppClass {
    private int max, min;

    public void setValue(int someInt) {
        this.max = Math.max(max, someInt);
        this.min = Math.min(min, someInt);
    }

    public void setValue(int max, int min){
        this.max = Math.max(max, min);
        this.min = Math.min(max, min);
    }

    public void printAllValues(){
        System.out.println("Значение max: " + max);
        System.out.println("Значение min: " + min);
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public Example_6_SuppClass(int max, int min) {
        this.max = Math.max(max, min);
        this.min = Math.min(max, min);
    }

    public Example_6_SuppClass(int someInt) {
        this.max = Math.max(max, someInt);
        this.min = Math.min(min, someInt);
    }

    public Example_6_SuppClass() {
    }
}

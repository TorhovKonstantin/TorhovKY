package lab5;

public class Example_5_SuppClass {
    private int closedInt; // закрытое поле

    public void setClosedInt(int closedInt) {
        this.closedInt = closedInt;
        if (closedInt > 100) closedInt = 100;
    }

    public void setClosedInt(){
        closedInt = 0;
    }

    public Example_5_SuppClass(int closedInt) {
        this.closedInt = closedInt;
        if (closedInt > 100) closedInt = 100;
    }

    public Example_5_SuppClass() {
        closedInt = 0;
    }

    public int getClosedInt() {
        return closedInt;
    }
}

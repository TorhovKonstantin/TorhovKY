package lab11;

public class Primer5 {
    public static void main(String[] args) {
        System.out.println(fact(8));
    }
    public static int fact(int n){
        System.out.println("fact(" + n + ")");
        if (n == 0) return 0;
        else if (n==1) return 1;
        else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("result = " + result);
            return result;
        }
    }
}

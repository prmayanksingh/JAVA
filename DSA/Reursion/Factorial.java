package Reursion;

public class Factorial {
    
    public static int fac (int n){
        if (n == 1){
            return 1;
        }
        int smallans = fac(n - 1);
        return n * smallans;
    }
    public static void main(String[] args) {
        int n = 4;
        int factorial = fac (n);
        System.out.println(factorial);

    }
}

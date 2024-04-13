package Reursion;

public class Mulitplication {

    public static int multiplyTwoInteger(int m, int n){
        // Base Case
        if (n == 0){
            return n;
        }
        
        // Smaller problem
        int smallans = multiplyTwoInteger(m, n - 1);

        // Calculation
        return m + smallans; 
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 0;
        System.out.println(multiplyTwoInteger(m, n));

    }
}

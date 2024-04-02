package Reursion;

public class sumofnNaturalnum {
    
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return sum(n-1) + n;
    }
    public static void main(String[] args) {
        int n = 5;
        int totalsum = sum(n);
        System.err.println(totalsum);
    }
}
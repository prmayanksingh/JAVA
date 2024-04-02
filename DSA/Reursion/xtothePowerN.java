package Reursion;

public class xtothePowerN {
    
    public static int power(int n, int x){
        if (n <= 0){
            return 1;
        }
        return power(n-1 , x) * x;
    }
    public static void main(String[] args) {
        int x = 9;
        int n = 3;
        int ans = power(n, x);
        System.out.println(ans);
    }                             
}   
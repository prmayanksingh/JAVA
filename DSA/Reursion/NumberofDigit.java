package Reursion;

public class NumberofDigit {

    public static int countDigits(int n){
        if (n == 0){
            return n;
        }
        return 1 + countDigits(n/10);
    }
    public static void main(String[] args) {
        int n = 123;
        int count = countDigits(n);
        System.out.println(count);
    }
}

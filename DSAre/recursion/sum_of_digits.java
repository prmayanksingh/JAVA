package recursion;

public class sum_of_digits {
    public static int sumOfDigits (int n) {
        if (n == 1 || n == 0) return n;
        return (n % 10) + (sumOfDigits(n/10));
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}

package recursion;

public class multiplication {
    public static int multiply (int m, int n){
        //base case
        if (n == 0){
            return n;
        }
        
        //smaller problem
        int smallans = multiply(m, n - 1);

        //calculation
        return m + smallans;
    }
    public static void main(String[] args) {
        System.out.println(multiply(3, 5));
    }
}

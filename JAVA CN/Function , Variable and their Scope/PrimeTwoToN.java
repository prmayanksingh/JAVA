public class PrimeTwoToN {

    public static boolean isPrime(int n){
        for (int d = 2;d < n;d++){
            if (n % d == 0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n){
        for(int i = 2;i <= n;i++){
            // check whether the number is Prime
            boolean isIPrime = isPrime(i);
            if (isIPrime){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printPrime (100);
    }
}
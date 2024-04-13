public class prime1 {
    public static boolean isPrime (int n){
        for (int d = 2 ; d < n ; d++){
            if (n % d == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean ans = isPrime (13);
        System.out.println(ans);
    }
}
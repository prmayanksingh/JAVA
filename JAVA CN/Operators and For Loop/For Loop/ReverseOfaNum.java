import java.util.Scanner;

public class ReverseOfaNum {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        long num = 0;
        for ( int i = 1 , t , wt = 0 ; n > 0 ; i++ , wt++){
            t = n % 2;
            n = n / 2;
            num = num + t * (long)Math.pow(10, wt);
        }
        System.out.println(num);
        s.close();
    }
}